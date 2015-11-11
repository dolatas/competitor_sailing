package com.dododev.sailingcompetition.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dododev.sailingcompetition.model.Competition;
import com.dododev.sailingcompetition.model.Competitor;

@RestController
@RequestMapping("/ws/competition")
public class CompetitionWS {

    private static final Logger LOG = LoggerFactory.getLogger(CompetitionWS.class);

    @RequestMapping("/getAll")
    public List<Competition> getAll() {
        LOG.info("Invoking CompetitionWS.getAll()");
        
		List<Competition> competitions = new ArrayList<Competition>();
		for(int i = 0; i < 3; i++){
			Competition competition = new Competition();
			competition.setId(new Long(i));
			competition.setName("test name " + i);
			competition.setStartDate(new Date());
			competition.setEndDate(new Date());
			competition.setShowGPS(Boolean.TRUE);
			competitions.add(competition);
		}
        return competitions;
    }

	@RequestMapping("/getById/{id}")
	public Competition getById(@PathVariable Long id) {
        LOG.info("Invoking CompetitionsWS.getById(" + id + ")");
		List<Competition> competitions = getAll();
		if(competitions != null && !competitions.isEmpty()){
			return competitions.get(id.intValue());
		}
		return null;
	}
	
	@RequestMapping("{competitionId}/addCompetitor/{competitiorId}")
    public Boolean addCompetitor(@PathVariable Long competitionId, @PathVariable Long competitorId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
