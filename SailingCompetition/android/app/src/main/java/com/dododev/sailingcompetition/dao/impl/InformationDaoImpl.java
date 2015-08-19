package com.dododev.sailingcompetition.dao.impl;

import com.dododev.sailingcompetition.dao.CompetitionDao;
import com.dododev.sailingcompetition.dao.InformationDao;
import com.dododev.sailingcompetition.model.Competition;
import com.dododev.sailingcompetition.model.Information;

import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by dodo on 2015-07-20.
 */
@EBean
public class InformationDaoImpl implements InformationDao {

    @Override
    public List<Information> findAll() {
//      TODO
//        for tests only

        List<Information> list = new ArrayList<Information>();
        for (int i = 0; i < 10; i++) {
            Information info = new Information();
            info.setId(new Long(i));
            info.setContent("Testowy komunikat " + i);
            info.setTime(new Date());
            list.add(info);
        }

        return list;
    }

    @Override
    public Information getById(Long id) {
        //TODO
        Information info = new Information();
        info.setId(id);
        info.setContent("Testowy komunikat " + id);
        info.setTime(new Date());
        return info;
    }
}
