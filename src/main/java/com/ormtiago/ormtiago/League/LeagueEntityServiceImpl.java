package com.ormtiago.ormtiago.League;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LeagueEntityServiceImpl implements LeagueEntityService{

	
	@Autowired
	private LeagueEntityRepository leagueRepository;
	@Override
	public List<LeagueEntity> listAllLeagues() {
		
		return (List<LeagueEntity>)leagueRepository.findAll();
	}
	
	  

}
