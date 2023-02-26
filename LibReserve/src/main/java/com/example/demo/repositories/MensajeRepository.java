package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Mensaje;


public interface MensajeRepository extends JpaRepository<Mensaje, Integer> {

}