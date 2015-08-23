package com.dododev.sailingcompetition.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dododev.sailingcompetition.dao.impl.CompetitionDaoImpl;
import com.dododev.sailingcompetition.dao.impl.CompetitorDaoImpl;
import com.dododev.sailingcompetition.model.Competition;
import com.dododev.sailingcompetition.model.Competitor;

public class CompetitorWS {

	@Autowired
	private CompetitorDaoImpl competitorDao;
	@Autowired
	private CompetitionDaoImpl competitionDao;
	
	public List<Competitor> getCompetitors(Long competitionId) {
		Competition competition = competitionDao.getCompetitionById(1L);
		competitorDao.getCompetitorsByCompetition(competition);
		// TODO Auto-generated method stub
		return null;
	}

}
