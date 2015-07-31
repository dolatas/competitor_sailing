package dodo.com.sailingcompetition;

import android.app.Fragment;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import dodo.com.sailingcompetition.dict.Gender;
import dodo.com.sailingcompetition.model.Competitor;


@EFragment(R.layout.sign_up_competitor)
public class SignUpCompetitor extends Fragment {

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
    EditText sailNo;
    @ViewById
    EditText clubName;
    @ViewById
    EditText birthDate;
    @ViewById
    EditText licenseNo;
    @ViewById
    Spinner gender;
    @ViewById
    EditText doctorsPerm;
    @ViewById
    Spinner country;
    @ViewById
    EditText place;

    @AfterViews
    void initView() {
        Log.i("Sailor", "SignUpCompetitor");

        //init spinners
        ArrayAdapter<CharSequence> genderAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.gender, android.R.layout.simple_spinner_item);
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gender.setAdapter(genderAdapter);

        ArrayAdapter<CharSequence> countryAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.country, android.R.layout.simple_spinner_item);
        countryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        country.setAdapter(countryAdapter);

    }

    @Click
    void save(){
        if(validateData()){
            try {
                Competitor competitor = new Competitor();
                competitor.setLogin(login.getText().toString());
                competitor.setEmail(email.getText().toString());
                competitor.setPassword(password.getText().toString());
                competitor.setFirstName(firstName.getText().toString());
                competitor.setLastName(lastName.getText().toString());
                competitor.setClubName(clubName.getText().toString());
                competitor.setLicenseNo(licenseNo.getText().toString());
                competitor.setGender(Gender.valueOf(gender.getSelectedItem().toString()));
                competitor.setCountry(country.getSelectedItem().toString());
                competitor.setPlace(place.getText().toString());
                competitor.setBirthDate(SDF.parse(birthDate.getText().toString()));
                competitor.setDoctorsPem(SDF.parse(doctorsPerm.getText().toString()));
            } catch (ParseException e) {
                Log.e("user data error", e.getStackTrace().toString());
            }

        }
    }

    private boolean validateData(){
        //TODO validation
        return true;
    }

}
