package com.ormtiago.ormtiago.Player;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

public interface PlayerEntityService {
	
	public List<PlayerEntity> listAllPlayers();
	
	public PlayerEntity createPlayer(PlayerEntity p);
	
	public PlayerEntity findPlayerById(Long id);
	
	public PlayerEntity updatePlater(PlayerEntity p);
	
	public void deletePlayer(Long id);
	



	

}
