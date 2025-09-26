package com.example.parcial2.repositorios;

import com.example.parcial2.modelos.DetalleCine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IDetalleCineRepositorio extends JpaRepository<DetalleCine, Integer> {
    Optional<DetalleCine> findByDireccion(String direccion);
    Optional<DetalleCine> findByCiudad(String ciudad);



}
