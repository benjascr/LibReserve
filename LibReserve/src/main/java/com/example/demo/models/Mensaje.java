package com.example.demo.models;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "mensaje")
public class Mensaje {
  
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
  
	@ManyToOne
	private Usuario usuario;
  
	private String contenido;
	private Date fecha;
  
  	public Mensaje() { 
  	}
  
  	public int getId() {
  		return id;
  	}
  
  	public void setId(int id) {
  		this.id = id;
  	}
  
  	public Usuario getUsuario() {
  		return usuario;
  	}
  
  	public void setUsuario(Usuario usuario) {
  		this.usuario = usuario;
  	}
  
  	public String getContenido() {
  		return contenido;
  	}
  
  	public void setContenido(String contenido) {
  		this.contenido = contenido;
  	}
  
  	public Date getFecha() {
  		return fecha;
  	}
  
  	public void setFecha(Date fecha) {
  		this.fecha = fecha;
  	}
  
}