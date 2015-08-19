package com.dododev.sailingcompetition.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.dododev.sailingcompetition.dao.InformationDao;
import com.dododev.sailingcompetition.dao.impl.InformationDaoImpl;
import com.dododev.sailingcompetition.model.Information;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.util.List;

/**
 * Created by dodo on 2015-07-20.
 */
@EBean
public class InformationListAdapter extends BaseAdapter {

    List<Information> information;

    @Bean(InformationDaoImpl.class)
    InformationDao informationDao;

    @RootContext
    Context context;

    @AfterInject
    void initAdapter() {
        information = informationDao.findAll();
    }

    @Override
    public int getCount() {
        return information.size();
    }

    @Override
    public Information getItem(int i) {
        return information.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        InformationItemView informationItemView;
        if (view == null) {
            informationItemView = InformationItemView_.build(context);
        } else {
            informationItemView = (InformationItemView) view;
        }

        informationItemView.bind(getItem(i));

        return informationItemView;
    }
}
