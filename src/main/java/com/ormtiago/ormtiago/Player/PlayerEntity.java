package com.ormtiago.ormtiago.Player;

import com.ormtiago.ormtiago.League.LeagueEntity;
import com.ormtiago.ormtiago.Team.TeamEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "players")
public class PlayerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "edad")
	private int edad;
	@Column(name = "altura")
	private int altura;
	@Column(name = "peso")
	private double peso;
	@Column(name = "pais")
	private String pais;
	@Column(name = "equipo")
	private String equipo;
	@Column(name = "liga")
	private String liga;

	@Column(name = "posicion", nullable = false, length = 15)
	@Enumerated(value = EnumType.STRING)
	private Posicion posicion;

	public PlayerEntity() {
	}

	

	public PlayerEntity(Long id, String nombre, String apellido, int edad, int altura, double peso, String pais,
			String equipo, String liga, Posicion posicion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.pais = pais;
		this.equipo = equipo;
		this.liga = liga;
		this.posicion = posicion;
	}
	
	public PlayerEntity( String nombre, String apellido, int edad, int altura, double peso, String pais,
			String equipo, String liga, Posicion posicion) {
		super();
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.pais = pais;
		this.equipo = equipo;
		this.liga = liga;
		this.posicion = posicion;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String getLiga() {
		return liga;
	}

	public void setLiga(String liga) {
		this.liga = liga;
	}

}
