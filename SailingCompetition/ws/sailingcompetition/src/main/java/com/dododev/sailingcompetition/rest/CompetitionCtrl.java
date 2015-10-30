package com.dododev.sailingcompetition.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dododev.sailingcompetition.model.Competition;

@RestController
@RequestMapping("/competition")
public class CompetitionCtrl {
    
	@RequestMapping("/getAll")
    public List<Competition> getAll() {
		
		List<Competition> competitions = new ArrayList<Competition>();
		for(int i = 0; i < 3; i++){
			Competition competition = new Competition();
			competition.setId(new Long(i));
			competition.setName("test name " + i);
			competition.setStartDate(new Date());
			competition.setEndDate(new Date());
			competitions.add(competition);
		}
		
        return competitions;
    }
	
	@RequestMapping("/getById/{id}")
	public Competition getById(@PathVariable Long id) {
		List<Competition> competitions = getAll();
		if(competitions != null && !competitions.isEmpty()){
			return competitions.get(id.intValue());
		}
		return null;
	}
}
