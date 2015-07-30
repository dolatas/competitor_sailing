package dodo.com.sailingcompetition;

import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import java.util.ArrayList;
import java.util.List;

import dodo.com.sailingcompetition.model.Competition;


@EActivity(R.layout.competitions_activity)
public class Competitions extends ListActivity {
    @AfterViews
    void initView() {
        Log.i("Sailor", "Competitions > initView");

        //TODO

    }


//    List<Competition> getCompetitions(){
//        //TODO rest WS getCompetition
//        List<Competition> testList = new ArrayList<Competition>();
//
//        for(int i = 0; i < 10; i++){
//            Competition competition = new Competition();
//            competition.setName("Przykładowe zawody " + i);
//            testList.add(competition);
//        }
//
//        return testList;
//    }
}
