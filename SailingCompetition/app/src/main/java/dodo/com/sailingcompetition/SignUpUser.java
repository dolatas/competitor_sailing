package dodo.com.sailingcompetition;

import android.app.Fragment;
import android.content.Intent;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import dodo.com.sailingcompetition.dict.Gender;
import dodo.com.sailingcompetition.model.Competitor;
import dodo.com.sailingcompetition.model.User;


@EFragment(R.layout.sign_up_user)
public class SignUpUser extends Fragment {

    private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd");

    @ViewById
    EditText login;
    @ViewById
    EditText email;
    @ViewById
    EditText password;
    @ViewById
    EditText firstName;
    @ViewById
    EditText lastName;
    @ViewById
    EditText birthDate;
    @ViewById
    Spinner gender;
    @ViewById
    Spinner country;

    @AfterViews
    void initView() {
        Log.i("Sailor", "SignUpUser");

        //init spinners
        ArrayAdapter<CharSequence> genderAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.gender, android.R.layout.simple_spinner_item);
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gender.setAdapter(genderAdapter);

        ArrayAdapter<CharSequence> countryAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.country, android.R.layout.simple_spinner_item);
        countryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        country.setAdapter(countryAdapter);

    }

    @Click
    void save() {
        try {
            //TODO validation
            User user = new User();
            user.setLogin(login.getText().toString());
            user.setEmail(email.getText().toString());
            user.setPassword(password.getText().toString());
            user.setFirstName(firstName.getText().toString());
            user.setLastName(lastName.getText().toString());
            //TODO
//                user.setGender(Gender.valueOf(gender.getSelectedItem().toString()));
            if (country.getSelectedItem() != null) {
                user.setCountry(country.getSelectedItem().toString());
            }
            user.setBirthDate(SDF.parse(birthDate.getText().toString()));
            startActivity(new Intent(getActivity(), ChooseAccount_.class));
        } catch (ParseException e) {
            Log.e("user data error", e.getStackTrace().toString());
        }

    }

    private boolean validateData() {
        return true;
    }

    @Click
    void delete() {
        //TODO confirmation popup and delete intead of chooseAccount
        startActivity(new Intent(getActivity(), ChooseAccount_.class));
    }

}
