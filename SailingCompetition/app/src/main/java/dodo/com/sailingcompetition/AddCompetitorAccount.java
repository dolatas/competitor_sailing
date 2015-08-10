package dodo.com.sailingcompetition;

import android.app.Fragment;
import android.content.Intent;
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


@EFragment(R.layout.add_competitor_account)
public class AddCompetitorAccount extends Fragment {

    private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd");

    @ViewById
    EditText sailNo;
    @ViewById
    EditText clubName;
    @ViewById
    EditText licenseNo;
    @ViewById
    EditText doctorsPerm;

    @AfterViews
    void initView() {
        Log.i("Sailor", "AddCompetitorAccount");


    }

    @Click
    void save() {
        if (validateData()) {
            try {
                Competitor competitor = new Competitor();
                competitor.setLicenseNo(licenseNo.getText().toString());
                competitor.setClubName(clubName.getText().toString());
                competitor.setLicenseNo(licenseNo.getText().toString());
                competitor.setDoctorsPem(SDF.parse(doctorsPerm.getText().toString()));
                startActivity(new Intent(getActivity(), Competitions_.class));
            } catch (ParseException e) {
                Log.e("competitor data error", e.getStackTrace().toString());
            }

        }
    }

    private boolean validateData() {
        //TODO validation
        return true;
    }


    @Click
    void cancel(){
        startActivity(new Intent(getActivity(), ChooseAccount_.class));
    }

    @Click
    void delete(){
        //TODO
        startActivity(new Intent(getActivity(), Competitions_.class));
    }

}
