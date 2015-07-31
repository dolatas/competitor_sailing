package dodo.com.sailingcompetition;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
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
    TextView name;

    @AfterViews
    void initView() {
        Log.i("Sailor", "CompetitionInfo > initView");

        //TODO
        Intent intent = getIntent();
        competition = intent.getParcelableExtra("competition");
        if(competition != null){
            dateFrom.setText(SDF.format(competition.getDateFrom()));
            dateTo.setText(SDF.format(competition.getDateTo()));
            name.setText(competition.getName());
        }
    }
}
