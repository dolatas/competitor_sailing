package com.dododev.sailingcompetition.dao.impl;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dododev.sailingcompetition.dao.CompetitionDao;
import com.dododev.sailingcompetition.model.Competition;
import com.dododev.sailingcompetition.utils.DBConnection;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;

public class CompetitionDaoImpl implements CompetitionDao{

	private static final Logger LOG = LoggerFactory.getLogger(CompetitionDaoImpl.class);
	
	@Autowired
	private DBConnection dbConnection;
	private Dao<Competition, String> dao;
	
	private void initializeDao(){
		try {
			dao = DaoManager.createDao(dbConnection.getConnectionSource(), Competition.class);
		} catch (SQLException e) {
			LOG.error("Exception in initializeDao. Exception details: {}", e);
		}
	}
	
	public Competition getCompetitionById(Long competitionId) {
	            
		if(dao == null){
			initializeDao();
		}
		
		return null;
	}

}
