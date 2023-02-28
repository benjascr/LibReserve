package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Puesto_lectura;
import com.example.demo.models.Reserva;
import com.example.demo.models.Sala;
import com.example.demo.models.Usuario;


public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
    List<Reserva> findByUsuario(Usuario usuario);
    List<Reserva> findBySala(Sala sala);
    List<Reserva> findByPuesto(Puesto_lectura puesto);
}