package dodo.com.sailingcompetition;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import java.util.List;

import dodo.com.sailingcompetition.model.User;

@EActivity(R.layout.choose_account_activity)
public class ChooseAccount extends ActionBarActivity {

    private final static String CHOOSE_ACCOUNT_MESSAGE = "Chosen account";

    @AfterViews
    void initView() {
        Log.i("Sailor", "ChooseAccount");
        //TODO get user from LogIn
        List<Object> accounts = getAccountsByUser(null);
        if(accounts != null){
            //TODO present accounts
        }
    }

    @Click // When R.id.competitorBtn button is clicked
    void competitorBtn(){
        Intent intent = new Intent(this, AddAccount_.class);
        intent.putExtra(CHOOSE_ACCOUNT_MESSAGE, "competitor");
        startActivity(intent);
    }

    @Click // When R.id.coachBtn button is clicked
    void coachBtn(){
        Intent intent = new Intent(this, AddAccount_.class);
        intent.putExtra(CHOOSE_ACCOUNT_MESSAGE, "coach");
        startActivity(intent);
    }

    //TODO create account class
    private List<Object> getAccountsByUser(User user){
        //TODO get accounts for user


        return null;
    }



}

