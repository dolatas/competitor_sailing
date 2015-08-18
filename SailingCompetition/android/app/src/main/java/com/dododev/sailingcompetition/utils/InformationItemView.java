package com.dododev.sailingcompetition.utils;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dododev.sailingcompetition.R;
import com.dododev.sailingcompetition.model.Competition;
import com.dododev.sailingcompetition.model.Information;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

import java.text.SimpleDateFormat;

/**
 * Created by dodo on 2015-07-20.
 */
@EViewGroup(R.layout.information_item)
public class InformationItemView extends LinearLayout {

    @ViewById
    TextView content;

    @ViewById
    TextView time;

    private static final SimpleDateFormat SDF = new SimpleDateFormat("HH:mm");

    public InformationItemView(Context context) {
        super(context);
    }

    public void bind(Information information) {
        content.setText(information.getContent());
        time.setText(SDF.format(information.getTime()));
    }

}
