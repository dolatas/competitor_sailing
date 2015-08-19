package com.dododev.sailingcompetition;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;


@EActivity(R.layout.track_form_activity)
public class TrackForm extends ActionBarActivity {

    @AfterViews
    void initView() {
        Log.i("Sailor", "TrackForm > initView");

        //TODO
    }
}
