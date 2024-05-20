package com.app.PortalEmpleos.domain.mapper;

import com.app.PortalEmpleos.domain.dto.TituloDTO;
import com.app.PortalEmpleos.persistence.entity.Titulo;

public class TituloMapper {
    public static TituloDTO toDto(Titulo titulo){
        TituloDTO tituloDTO = new TituloDTO();
        tituloDTO.setProfesional(titulo.getProfesional());
        tituloDTO.setTitulo(titulo.getTitulo());
        tituloDTO.setId_titulo(titulo.getId_titulo());
        return tituloDTO;
    }
    
    public static Titulo toEntity(TituloDTO tituloDTO){
        Titulo titulo = new Titulo();
        titulo.setProfesional(tituloDTO.getProfesional());
        titulo.setTitulo(tituloDTO.getTitulo());
        titulo.setId_titulo(tituloDTO.getId_titulo());
        return titulo;
    }
}
