package com.ormtiago.ormtiago.Player;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Service
public class PlayerEntityServiceImpl implements PlayerEntityService {
	
	@PersistenceContext
	private EntityManager em;

	@Autowired
	private PlayerEntityRepository playerRepository;

	@Override
	public List<PlayerEntity> listAllPlayers() {

		return (List<PlayerEntity>) playerRepository.findAll();
	}

	@Override
	public PlayerEntity createPlayer(PlayerEntity p) {
		return playerRepository.save(p);
	}

	@Override
	public PlayerEntity findPlayerById(Long id) {

		return playerRepository.findById(id).get();
	}

	@Override
	public PlayerEntity updatePlater(PlayerEntity p) {

		return playerRepository.save(p);
	}

	@Override
	public void deletePlayer(Long id) {

		playerRepository.deleteById(id);

	}


	


}
