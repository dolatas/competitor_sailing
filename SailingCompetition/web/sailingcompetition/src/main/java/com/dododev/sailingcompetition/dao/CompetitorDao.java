package com.dododev.sailingcompetition.dao;

import java.util.List;

import com.dododev.sailingcompetition.model.Competition;
import com.dododev.sailingcompetition.model.Competitor;

public interface CompetitorDao {
	public List<Competitor> getCompetitorsByCompetition(Competition competition);
}
