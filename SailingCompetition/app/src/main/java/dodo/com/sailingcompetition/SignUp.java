package dodo.com.sailingcompetition;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.FragmentById;

import java.util.List;


@EActivity(R.layout.sign_up_activity)
public class SignUp extends ActionBarActivity {

    private final static String CHOOSE_ACCOUNT_MESSAGE = "Chosen account";

    @AfterViews
    void initView() {
        Log.i("Sailor", "SignUp");
        //TODO
        Intent intent = getIntent();
        String chosenAccount = intent.getStringExtra(CHOOSE_ACCOUNT_MESSAGE);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if(chosenAccount.equals("competitor")){
            SignUpCompetitor_ fragment = new SignUpCompetitor_();
            fragmentTransaction.add(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        } else if(chosenAccount.equals("coach")){
            SignUpCoach_ fragment = new SignUpCoach_();
            fragmentTransaction.add(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        } else { //if(chosenAccount.equals("buoy")){
            //TODO
            Toast.makeText(getApplicationContext(), "TODO buoy not ready", Toast.LENGTH_LONG);
        }
    }
}
