package com.example.parcial2.modelos.mapas;

import com.example.parcial2.modelos.DetalleCine;
import com.example.parcial2.modelos.dtos.CineDTO;
import com.example.parcial2.modelos.dtos.DetalleCineDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaDetalleCine {
    IMapaDetalleCine INSTANCE = Mappers.getMapper(IMapaDetalleCine.class);

    @Mapping(source = "direccion", target = "direccion")
    @Mapping(source = "ciudad", target = "ciudad")
    @Mapping(source = "telefono", target = "telefono")

    DetalleCineDTO convertirDTO(DetalleCine detalleCine);
    List<CineDTO> convertirListaDTO(List<DetalleCine>lista);

}
