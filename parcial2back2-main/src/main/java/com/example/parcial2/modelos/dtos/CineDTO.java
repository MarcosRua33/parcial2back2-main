package com.example.parcial2.modelos.dtos;

import com.example.parcial2.modelos.DetalleCine;

public class CineDTO {
    private String nombre;
    private DetalleCine detalle;

    public CineDTO() {
    }

    public CineDTO(String nombre, DetalleCine detalle) {
        this.nombre = nombre;
        this.detalle = detalle;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DetalleCine getDetalle() {
        return detalle;
    }

    public void setDetalle(DetalleCine detalle) {
        this.detalle = detalle;
    }
}
