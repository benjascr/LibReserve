package com.example.demo.models;

import java.util.List;

import javax.persistence.*;

@Entity
public class Sala {
  
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nombre;
	private String descripcion;
	private int capacidad;
	private boolean disponible;
	
	@OneToMany(mappedBy = "sala", cascade = CascadeType.ALL)
	private List<Reserva> reservas;
  
	public Sala() {
	}
  
	public Sala(String nombre, String descripcion, int capacidad, boolean disponible) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.capacidad = capacidad;
		this.disponible = disponible;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}
