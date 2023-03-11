package com.ormtiago.ormtiago.Team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ormtiago.ormtiago.Player.PlayerEntity;
import com.ormtiago.ormtiago.Player.PlayerEntityRepository;

@Service
public class TeamEntityServiceImpl implements TeamEntityService{

	@Autowired
	private TeamEntityRepository teamRepository;
	
	@Override
	public TeamEntity createTeam(TeamEntity t) {
		return teamRepository.save(t);	
	}

	@Override
	public List<TeamEntity> listAllTeams() {
		
		return (List<TeamEntity>) teamRepository.findAll();
	}

}
