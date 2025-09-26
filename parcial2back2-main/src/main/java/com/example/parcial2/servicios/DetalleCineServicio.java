package com.example.parcial2.servicios;

import com.example.parcial2.ayudas.MensajeError;
import com.example.parcial2.modelos.DetalleCine;
import com.example.parcial2.modelos.dtos.DetalleCineDTO;
import com.example.parcial2.modelos.mapas.IMapaDetalleCine;
import com.example.parcial2.repositorios.IDetalleCineRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleCineServicio{
    @Autowired
    private IDetalleCineRepositorio repositorio;
    @Autowired
    IMapaDetalleCine mapa;

    public DetalleCineDTO guardarDetalleCine(DetalleCine datosDetallesCine)throws Exception{
        try{
            return mapa.convertirDTO(repositorio.save(datosDetallesCine));
        } catch (Exception error) {
            throw new Exception(MensajeError.ERROR_CINE_NO_ENCONTRADO.getDescripcion() +error.getMessage());
        }

    }

}
