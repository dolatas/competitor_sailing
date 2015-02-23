package com.competition.sailing;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import android.app.Activity;
import android.util.Log;
import android.widget.EditText;

@EActivity(R.layout.login_activity)
public class Login extends Activity {

	@ViewById
	EditText login;

	@AfterViews
	void updateTextWithDate() {
		Log.i("Sailor", "test");
		login.setText("test");
	}
}
