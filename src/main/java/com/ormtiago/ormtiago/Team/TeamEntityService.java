package com.ormtiago.ormtiago.Team;

import java.util.List;

import com.ormtiago.ormtiago.Player.PlayerEntity;

public interface TeamEntityService {

	public TeamEntity createTeam(TeamEntity t);

	
	
	public List<TeamEntity> listAllTeams();
}
