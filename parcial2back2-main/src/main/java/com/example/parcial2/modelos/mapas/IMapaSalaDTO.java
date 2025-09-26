package com.example.parcial2.modelos.mapas;

import com.example.parcial2.modelos.Cine;
import com.example.parcial2.modelos.Sala;
import com.example.parcial2.modelos.dtos.CineDTO;
import com.example.parcial2.modelos.dtos.SalaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")

public interface IMapaSalaDTO {
    IMapaSalaDTO INSTANCE = Mappers.getMapper(IMapaSalaDTO.class);
    @Mapping(source = "cine.nombre", target = "nombre")
    @Mapping(source = "capacidad", target = "capacidad")
    @Mapping(source = "tipo", target = "tipo")
    SalaDTO convertirListaDTO(Sala sala);

    List<SalaDTO> convertirListaDTO(List<Sala>lista);



}
