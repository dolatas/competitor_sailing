package dodo.com.sailingcompetition;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;


@EActivity(R.layout.sign_up_activity)
public class AddAccount extends ActionBarActivity {

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
            AddCompetitorAccount_ fragment = new AddCompetitorAccount_();
            fragmentTransaction.add(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        } else if(chosenAccount.equals("coach")){
            AddCoachAccount_ fragment = new AddCoachAccount_();
            fragmentTransaction.add(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid account type", Toast.LENGTH_LONG);
        }
    }
}
