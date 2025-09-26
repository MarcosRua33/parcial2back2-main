package com.example.parcial2.servicios;

import com.example.parcial2.ayudas.MensajeError;
import com.example.parcial2.modelos.Sala;
import com.example.parcial2.modelos.dtos.SalaDTO;
import com.example.parcial2.modelos.mapas.IMapaSalaDTO;
import com.example.parcial2.repositorios.ISalaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaServicios {
    @Autowired
    private ISalaRepositorio repositorio;
    @Autowired
    IMapaSalaDTO mapa;

    public SalaDTO guardarSala(Sala datosSala)throws  Exception{
        try {
            return mapa.convertirListaDTO(repositorio.save(datosSala));
        }catch (Exception error){
            throw  new Exception(MensajeError.ERROR_CINE_NO_ENCONTRADO.getDescripcion());
        }
    }
}
