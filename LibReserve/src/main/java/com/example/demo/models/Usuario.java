package com.example.demo.models;

import java.util.List;

import javax.persistence.*;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String apellidos;
	private String correo;
	private String contrasena;
	
	@OneToMany(mappedBy = "usuario")
	private List<Reserva> reservas;
	
	public Usuario() {}
	
	public Usuario(String nombre) {
		this.nombre = nombre;
	}

	public Usuario(String nombre, String apellidos, String correo, String contrasena) {
	    this.nombre = nombre;
	    this.apellidos = apellidos;
	    this.correo = correo;
	    this.contrasena = contrasena;
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
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	
}