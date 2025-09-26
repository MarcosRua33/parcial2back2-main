package com.example.parcial2.modelos.mapas;

import com.example.parcial2.modelos.Cine;
import com.example.parcial2.modelos.dtos.CineDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaCineDTO {
    IMapaCineDTO INSTANCE = Mappers.getMapper(IMapaCineDTO.class);
    @Mapping(source="nombre", target="nombre")
    @Mapping(source="detalle", target="detalle")
    CineDTO convertirDTO(Cine cine);

    List<CineDTO> convertirListaDTO(List<Cine>lista);


}
