package com.example.demo.models;

import javax.persistence.*;

@Entity
public class Puesto_lectura {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String descripcion;
    private boolean disponible;
    
    public Puesto_lectura() {
    }
    
    public Puesto_lectura(String nombre, String descripcion, boolean disponible) {
    	this.nombre = nombre;
    	this.descripcion = descripcion;
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
    
    public boolean getDisponible() {
        return disponible;
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
