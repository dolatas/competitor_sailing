package com.dododev.sailingcompetition.dao;

import java.util.List;

import com.dododev.sailingcompetition.model.Competition;

/**
 * Created by dodo on 2015-07-20.
 */

public interface CompetitionDao  {
    List<Competition> findAll();
    Competition getById(Long id);
}
