package com.ormtiago.ormtiago.League;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "leagues")
public class LeagueEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nombre;
	@Column
	private String acronym;
	
	public LeagueEntity() {}

	public LeagueEntity(Long id, String nombre, String acronym) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.acronym = acronym;
	}
	
	public LeagueEntity( String nombre, String acronym) {
		super();
		
		this.nombre = nombre;
		this.acronym = acronym;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}
	
	
	
	



















}
