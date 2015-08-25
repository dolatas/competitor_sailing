package com.dododev.sailingcompetition.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dododev.sailingcompetition.dao.CompetitorDao;
import com.dododev.sailingcompetition.model.Competition;
import com.dododev.sailingcompetition.model.Competitor;
import com.dododev.sailingcompetition.utils.DBConnection;

public class CompetitorDaoImpl implements CompetitorDao{

	private static final Logger LOG = LoggerFactory.getLogger(CompetitorDaoImpl.class);
	
	@Autowired
	private DBConnection dbConnection;
	private Dao<Competitor, String> dao;
	
	private void initializeDao(){
		try {
			dao = DaoManager.createDao(dbConnection.getConnectionSource(), Competitor.class);
		} catch (SQLException e) {
			LOG.error("Exception in initializeDao. Exception details: {}", e);
		}
	}
	
	public List<Competitor> getCompetitorsByCompetition(Competition competition) {
	            
		if(dao == null){
			initializeDao();
		}
		// TODO Auto-generated method stub
		return null;
	}

}
