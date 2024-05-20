package com.app.PortalEmpleos.domain.mapper;

import com.app.PortalEmpleos.domain.dto.VacanteDTO;
import com.app.PortalEmpleos.persistence.entity.Vacante;

public class VacanteMapper {
    public static VacanteDTO toDto(Vacante vacante){
        VacanteDTO vacanteDTO = new VacanteDTO();
        vacanteDTO.setContratados(vacante.getContratados());
        vacanteDTO.setPostulados(vacante.getPostulados());
        vacanteDTO.setContratista(vacante.getContratista());
        vacanteDTO.setEmpresa(vacante.getEmpresa());
        vacanteDTO.setDisponibles(vacante.getDisponibles());
        vacanteDTO.setExperiencia(vacante.getExperiencia());
        vacanteDTO.setLugar(vacante.getLugar());
        vacanteDTO.setTiempo(vacante.getTiempo());
        vacanteDTO.setJornada(vacante.getJornada());
        vacanteDTO.setSalario(vacante.getSalario());
        vacanteDTO.setDescripcion(vacante.getDescripcion());
        vacanteDTO.setTitulo(vacante.getTitulo());
        vacanteDTO.setId_vacante(vacante.getId_vacante());
        return vacanteDTO;
    }
    
    public static Vacante toEntity(VacanteDTO vacanteDTO){
        Vacante vacante = new Vacante();
        vacante.setContratados(vacanteDTO.getContratados());
        vacante.setPostulados(vacanteDTO.getPostulados());
        vacante.setContratista(vacanteDTO.getContratista());
        vacante.setEmpresa(vacanteDTO.getEmpresa());
        vacante.setDisponibles(vacanteDTO.getDisponibles());
        vacante.setExperiencia(vacanteDTO.getExperiencia());
        vacante.setLugar(vacanteDTO.getLugar());
        vacante.setTiempo(vacanteDTO.getTiempo());
        vacante.setJornada(vacanteDTO.getJornada());
        vacante.setSalario(vacanteDTO.getSalario());
        vacante.setDescripcion(vacanteDTO.getDescripcion());
        vacante.setTitulo(vacanteDTO.getTitulo());
        vacante.setId_vacante(vacanteDTO.getId_vacante());
        return vacante;
    }
}
