package com.dododev.sailingcompetition.dao;

import com.dododev.sailingcompetition.model.Competition;

public interface CompetitionDao {
	Competition getCompetitionById(Long competitionId);
}
