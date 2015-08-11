package dodo.com.sailingcompetition;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.text.SimpleDateFormat;

import dodo.com.sailingcompetition.model.Competition;


@EActivity(R.layout.competition_info_activity)
public class CompetitionInfo extends ActionBarActivity {

    private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    private Competition competition;

    @ViewById
    TextView dateFrom;
    @ViewById
    TextView dateTo;
    @ViewById
    TextView competitionName;

    @AfterViews
    void initView() {
        Log.i("Sailor", "CompetitionInfo > initView");

        //TODO
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            competition = (Competition) bundle.getSerializable("competition");
            if(competition != null){
                dateFrom.setText(SDF.format(competition.getDateFrom()));
                dateTo.setText(SDF.format(competition.getDateTo()));
                competitionName.setText(competition.getName());
            }
        }
    }

    @Click
    void preview() {
        startActivity(new Intent(this, RaceMap_.class));
    }

    @Click
    void race() {
        startActivity(new Intent(this, RaceInfo_.class));
    }
}
