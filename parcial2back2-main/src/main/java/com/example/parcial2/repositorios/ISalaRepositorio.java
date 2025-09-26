package com.example.parcial2.repositorios;

import com.example.parcial2.modelos.Cine;
import com.example.parcial2.modelos.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ISalaRepositorio extends JpaRepository<Sala, Integer> {
    Optional<Sala> findByNombre(String nombre);

    //Buscando un usuario por correo
    Optional<Sala>findByTipo(String Tipo);

    //Buscando todos los usuarios que tengan un nombre en especifico

    List<Sala> findByNombreStartingWith(String Nombre);
}
