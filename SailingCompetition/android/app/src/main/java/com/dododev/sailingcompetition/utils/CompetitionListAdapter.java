package com.dododev.sailingcompetition.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.dododev.sailingcompetition.dao.CompetitionDao;
import com.dododev.sailingcompetition.dao.impl.CompetitionDaoImpl;
import com.dododev.sailingcompetition.model.Competition;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.util.List;

/**
 * Created by dodo on 2015-07-20.
 */
@EBean
public class CompetitionListAdapter extends BaseAdapter {

    List<Competition> competitions;

    @Bean(CompetitionDaoImpl.class)
    CompetitionDao competitionDao;

    @RootContext
    Context context;

    @AfterInject
    void initAdapter() {
        competitions = competitionDao.findAll();
    }

    @Override
    public int getCount() {
        return competitions.size();
    }

    @Override
    public Competition getItem(int i) {
        return competitions.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        CompetitionItemView competitionItemView;
        if (view == null) {
            competitionItemView = CompetitionItemView_.build(context);
        } else {
            competitionItemView = (CompetitionItemView) view;
        }

        competitionItemView.bind(getItem(i));

        return competitionItemView;
    }
}
