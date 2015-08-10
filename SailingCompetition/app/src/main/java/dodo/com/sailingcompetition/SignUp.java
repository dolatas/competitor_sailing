package dodo.com.sailingcompetition;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import java.text.ParseException;

import dodo.com.sailingcompetition.dict.Gender;
import dodo.com.sailingcompetition.model.Competitor;
import dodo.com.sailingcompetition.model.User;


@EActivity(R.layout.sign_up_activity)
public class SignUp extends ActionBarActivity {

    private final static String CHOOSE_ACCOUNT_MESSAGE = "Chosen account";

    @AfterViews
    void initView() {
        Log.i("Sailor", "SignUp");
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        SignUpUser_ fragment = new SignUpUser_();
        fragmentTransaction.add(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }
}
