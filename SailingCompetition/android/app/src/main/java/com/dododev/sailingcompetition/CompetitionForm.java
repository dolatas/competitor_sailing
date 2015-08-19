package com.dododev.sailingcompetition;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.dododev.sailingcompetition.model.Competition;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;


@EActivity(R.layout.competition_form_activity)
public class CompetitionForm extends ActionBarActivity {

    private Competition competition;

    @AfterViews
    void initView() {
        Log.i("Sailor", "CompetitionForm > initView");

        //TODO
    }
}
