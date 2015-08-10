package dodo.com.sailingcompetition;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.log_in_activity)
public class LogIn extends ActionBarActivity {

    @ViewById
    EditText login;
    @ViewById
    EditText password;

    @AfterViews
    void updateTextWithDate() {
        Log.i("Sailor", "test");
        login.setText("test");

        //TODO below button click
        boolean logged = logIn(login.getText().toString(), password.getText().toString());
        if(logged){
            Log.i("Sailor", "user " + login.getText().toString() + " log in success");
            //TODO logIn success
            //go to choose account
        } else {
            Log.i("Sailor", "log in failed");
            //TODO logIn failed
        }

    }

    @Click // When R.id.logIn button is clicked
    void logIn() {
        startActivity(new Intent(this, Competitions_.class));
    }

    @Click // When R.id.signUp button is clicked
    void signUp() {
        startActivity(new Intent(this, SignUp_.class));
    }

    @Click // When R.id.forgotPassword button is clicked
    void forgotPassword() {
        Toast.makeText(getApplicationContext(), "TODO: forgot password btn clicked", Toast.LENGTH_LONG);
    }



    private boolean logIn(String username, String password){
        //TODO logIn
        return true;
    }
}
