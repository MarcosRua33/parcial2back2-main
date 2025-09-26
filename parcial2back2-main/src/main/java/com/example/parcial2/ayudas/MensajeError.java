package com.example.parcial2.ayudas;

public enum MensajeError {
    ERROR_GENERAL_CINE("Upps fallamos al intentar procesar el API"),
    ERROR_CINE_NO_ENCONTRADO("El cine que buscas no está en BD")
    ;

    private final String descripcion;

    MensajeError(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
