package dodo.com.sailingcompetition.dao;

import java.util.List;

import dodo.com.sailingcompetition.model.Competition;

/**
 * Created by dodo on 2015-07-20.
 */

public interface CompetitionDao  {
    List<Competition> findAll();
}
