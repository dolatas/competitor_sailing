package com.dododev.sailingcompetition;

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
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.ViewById;

import com.dododev.sailingcompetition.model.Competition;
import com.dododev.sailingcompetition.utils.CompetitionListAdapter;

import static android.widget.Toast.makeText;

@EActivity(R.layout.competitions_activity)
@OptionsMenu(R.menu.menu_competitions)
public class Competitions extends ActionBarActivity {

    @ViewById
    ListView competitionList;

    @Bean
    CompetitionListAdapter adapter;

    @AfterViews
    void initView() {
        Log.i("Sailor", "Competitions > initView");
        competitionList.setAdapter(adapter);
        //TODO
    }

    @Click
    void action_settings() {
        startActivity(new Intent(this, Settings_.class));
    }


    @ItemClick
    void competitionListItemClicked(Competition competition) {
        Intent intent = new Intent(this, CompetitionInfo_.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("competition", competition);
        intent.putExtras(bundle);
        startActivity(intent);
//        Toast.makeText(this, competition.getName(), Toast.LENGTH_SHORT).show();
    }


}
