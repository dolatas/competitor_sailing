package com.dododev.sailingcompetition.dao.impl;

import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.dododev.sailingcompetition.dao.CompetitionDao;
import com.dododev.sailingcompetition.model.Competition;

/**
 * Created by dodo on 2015-07-20.
 */
@EBean
public class CompetitionDaoImpl implements CompetitionDao {

    @Override
    public List<Competition> findAll() {
//      TODO
//        for tests only

        List<Competition> list = new ArrayList<Competition>();
        for (int i = 0; i < 10; i++) {
            Competition c = new Competition();
            c.setName("Testowe zawody " + i);
            c.setDateFrom(new Date());
            c.setDateTo(new Date());
            list.add(c);
        }

        return list;
    }

    @Override
    public Competition getById(Long id) {
        //TODO
        Competition c = new Competition();
        c.setId(id);
        c.setName("Testowe zawody " + id);
        c.setDateFrom(new Date());
        c.setDateTo(new Date());
        return c;
    }
}
