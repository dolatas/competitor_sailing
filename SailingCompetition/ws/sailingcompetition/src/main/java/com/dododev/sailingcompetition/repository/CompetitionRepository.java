package com.dododev.sailingcompetition.repository;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dododev.sailingcompetition.model.Competition;

public interface CompetitionRepository extends JpaRepository<Competition, Long> {
//    Collection<Competition> findByDates(Date startDate, Date endDate);
}
