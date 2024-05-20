package com.app.PortalEmpleos.domain.mapper;

import com.app.PortalEmpleos.domain.dto.HistoriaLaboralDTO;
import com.app.PortalEmpleos.persistence.entity.HistoriaLaboral;

public class HistoriaLaboralMapper {
    public static HistoriaLaboralDTO toDto(HistoriaLaboral historiaLaboral){
        HistoriaLaboralDTO historiaLaboralDTO = new HistoriaLaboralDTO();
        historiaLaboralDTO.setProfesional(historiaLaboral.getProfesional());
        historiaLaboralDTO.setAño(historiaLaboral.getAño());
        historiaLaboralDTO.setLugar(historiaLaboral.getLugar());
        historiaLaboralDTO.setCargo(historiaLaboral.getCargo());
        historiaLaboralDTO.setId_historia_laboral(historiaLaboral.getId_historia_laboral());
        return historiaLaboralDTO;
    }
    
    public static HistoriaLaboral toEntity(HistoriaLaboralDTO historiaLaboralDTO){
        HistoriaLaboral historiaLaboral = new HistoriaLaboral();
        historiaLaboral.setProfesional(historiaLaboralDTO.getProfesional());
        historiaLaboral.setAño(historiaLaboralDTO.getAño());
        historiaLaboral.setLugar(historiaLaboralDTO.getLugar());
        historiaLaboral.setCargo(historiaLaboralDTO.getCargo());
        historiaLaboral.setId_historia_laboral(historiaLaboralDTO.getId_historia_laboral());
        return historiaLaboral;
    }
}
