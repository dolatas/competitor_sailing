package com.dododev.sailingcompetition.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dododev.sailingcompetition.model.Competitor;

@RestController
@RequestMapping("ws/competitor")
public class CompetitorWS {

	@RequestMapping("/getCompetitors/{competitionId}")
    public List<Competitor> getCompetitors(@PathVariable Long competitionId) {
		// TODO Auto-generated method stub
		return null;
	}

}
