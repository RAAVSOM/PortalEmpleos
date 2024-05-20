package com.app.PortalEmpleos.domain.mapper;

import com.app.PortalEmpleos.domain.dto.ProfesionalDTO;
import com.app.PortalEmpleos.persistence.entity.Profesional;



public class ProfesionalMapper {
    public static ProfesionalDTO toDto(Profesional profesional){
        ProfesionalDTO profesionalDTO = new ProfesionalDTO();
        profesionalDTO.setHistoriasLaborales(profesional.getHistoriasLaborales());
        profesionalDTO.setCertificados(profesional.getCertificados());
        profesionalDTO.setTitulos(profesional.getTitulos());
        profesionalDTO.setId_profesional(profesional.getId_profesional());
        return profesionalDTO;
    }
    
    public static Profesional toEntity(ProfesionalDTO profesionalDTO){
        Profesional profesional = new Profesional();
        profesional.setHistoriasLaborales(profesionalDTO.getHistoriasLaborales());
        profesional.setCertificados(profesionalDTO.getCertificados());
        profesional.setTitulos(profesionalDTO.getTitulos());
        profesional.setId_profesional(profesionalDTO.getId_profesional());
        return profesional;
    }
}
