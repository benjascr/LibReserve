package com.example.demo.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Reserva {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Sala sala;
    
    @ManyToOne
    private Puesto_lectura puesto;

    private Date fechaInicio;
    private Date fechaFin;
    
    public Reserva(){
    	
    }
    
    public Reserva(Usuario usuario, Sala sala) {
    	this.usuario = usuario;
    	this.sala = sala;
    }
    
    public Reserva(Date fechaInicio, Date fechaFin, Usuario usuario, Sala sala) {
    	this.fechaInicio = fechaInicio;
    	this.fechaFin = fechaFin;
    	this.usuario = usuario;
    	this.sala = sala;
    }
    
    public Reserva(Date fechaInicio, Date fechaFin, Usuario usuario, Puesto_lectura puesto) {
    	this.fechaInicio = fechaInicio;
    	this.fechaFin = fechaFin;
    	this.usuario = usuario;
    	this.puesto = puesto;
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

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}