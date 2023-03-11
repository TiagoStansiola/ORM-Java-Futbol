package com.ormtiago.ormtiago;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ormtiago.ormtiago.Player.PlayerEntity;
import com.ormtiago.ormtiago.Player.PlayerEntityRepository;
import com.ormtiago.ormtiago.Player.Posicion;


@SpringBootApplication
public class OrmTiagoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OrmTiagoApplication.class, args);
	}
	@Autowired
	private PlayerEntityRepository playerRepository;

	@Override
	public void run(String... args) throws Exception {
		
	
		
//		PlayerEntity pe1 = new PlayerEntity("leo","messi",30,169,70.0,Posicion.DELANTERO);
//		
//		playerRepository.save(pe1);
//		
//		PlayerEntity pe2 = new PlayerEntity("cristiano","ronaldo",36,190,70.0,Posicion.DELANTERO);
//		
//		playerRepository.save(pe2);
		
		
		
		
		
	}

}