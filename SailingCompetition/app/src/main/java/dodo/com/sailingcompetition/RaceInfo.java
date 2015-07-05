package dodo.com.sailingcompetition;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;


@EActivity(R.layout.race_info_activity)
public class RaceInfo extends ActionBarActivity {

    @AfterViews
    void initView() {
        Log.i("Sailor", "RaceInfo > initView");

        //TODO

    }
}
