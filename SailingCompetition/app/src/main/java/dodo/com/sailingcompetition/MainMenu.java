package dodo.com.sailingcompetition;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.main_menu_activity)
public class MainMenu extends ActionBarActivity {

    @AfterViews
    void initView() {
        Log.i("Sailor", "MainMenu > initView");
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
}
