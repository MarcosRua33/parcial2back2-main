package com.example.parcial2.servicios;

import com.example.parcial2.ayudas.MensajeError;
import com.example.parcial2.modelos.Cine;
import com.example.parcial2.modelos.dtos.CineDTO;
import com.example.parcial2.modelos.mapas.IMapaCineDTO;
import com.example.parcial2.repositorios.ICineRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CineServicio {
    @Autowired
    private ICineRepositorio repositorio;

    @Autowired
    IMapaCineDTO mapa;

    // Guardar Cine
   public  CineDTO guardarCine(Cine datosCine)throws Exception{
       try{
           return  mapa.convertirDTO(repositorio.save(datosCine));
       }catch (Exception error){
           throw  new Exception(MensajeError.ERROR_CINE_NO_ENCONTRADO.getDescripcion() +error.getMessage());
       }

   }
    //servicio para buscar por nombre
    public List<CineDTO> buscarCinePorNombre(String nombre)throws Exception{
        try{
            return mapa.convertirListaDTO(repositorio.findByNombreContaining(nombre));
        }catch(Exception error){
            throw new Exception(MensajeError.ERROR_GENERAL_CINE.getDescripcion()+error.getMessage());
        }
    }

}
