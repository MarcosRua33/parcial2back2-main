package com.example.parcial2.repositorios;

import com.example.parcial2.modelos.Cine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ICineRepositorio extends JpaRepository<Cine, Integer> {

    Optional<Cine> findBybuscarCinePorNombre(String nombre);

    //Buscando un usuario por correo

    //Buscando todos los usuarios que tengan un nombre en especifico

    List<Cine>findByNombreStartingWith(String Nombre);

    List<Cine> findByNombreContaining(String nombre);
}
