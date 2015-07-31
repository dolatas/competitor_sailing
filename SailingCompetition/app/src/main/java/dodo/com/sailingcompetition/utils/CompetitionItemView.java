package dodo.com.sailingcompetition.utils;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

import java.text.SimpleDateFormat;

import dodo.com.sailingcompetition.R;
import dodo.com.sailingcompetition.model.Competition;

/**
 * Created by dodo on 2015-07-20.
 */
@EViewGroup(R.layout.competition_item)
public class CompetitionItemView extends LinearLayout {

    @ViewById
    TextView name;

    @ViewById
    TextView dateFrom;

    @ViewById
    TextView dateTo;

    private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public CompetitionItemView(Context context) {
        super(context);
    }

    public void bind(Competition competition) {
        name.setText(competition.getName());
        dateFrom.setText(SDF.format(competition.getDateFrom()));
        dateTo.setText(SDF.format(competition.getDateTo()));
    }

}
