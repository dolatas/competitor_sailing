package dodo.com.sailingcompetition;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.plus.model.people.Person;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.ViewById;

import dodo.com.sailingcompetition.model.Competition;
import dodo.com.sailingcompetition.utils.CompetitionListAdapter;

import static android.widget.Toast.makeText;

@EActivity(R.layout.main_menu_activity)
public class MainMenu extends ActionBarActivity {

    @ViewById
    ListView competitionList;

    @Bean
    CompetitionListAdapter adapter;

    @AfterViews
    void initView() {
        Log.i("Sailor", "MainMenu > initView");

        competitionList.setAdapter(adapter);
        //TODO
    }

    @Click
    void competitions() {
        startActivity(new Intent(this, Competitions_.class));
    }

    @Click
    void settings() {
        startActivity(new Intent(this, Settings_.class));
    }


    @ItemClick
    void competitionListItemClicked(Competition competition) {
        Toast.makeText(this, competition.getName(), Toast.LENGTH_SHORT).show();
    }


}
