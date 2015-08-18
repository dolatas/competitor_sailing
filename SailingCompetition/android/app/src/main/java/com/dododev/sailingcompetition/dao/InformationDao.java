package com.dododev.sailingcompetition.dao;

import com.dododev.sailingcompetition.model.Competition;
import com.dododev.sailingcompetition.model.Information;

import java.util.List;

/**
 * Created by dodo on 2015-07-20.
 */

public interface InformationDao {
    List<Information> findAll();
    Information getById(Long id);
}
