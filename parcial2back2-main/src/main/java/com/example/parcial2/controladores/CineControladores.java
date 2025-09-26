package com.example.parcial2.controladores;

import com.example.parcial2.modelos.Cine;
import com.example.parcial2.servicios.CineServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cines")
public class CineControladores {
    @Autowired
    CineServicio servicio;
    @PostMapping
    public ResponseEntity<?>operacionGuardar(@RequestBody Cine datos){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicio.guardarCine(datos));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body((error.getMessage()));

        }
    }



}
