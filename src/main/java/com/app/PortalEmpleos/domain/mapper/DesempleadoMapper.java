package com.app.PortalEmpleos.domain.mapper;

import com.app.PortalEmpleos.domain.dto.DesempleadoDTO;
import com.app.PortalEmpleos.persistence.entity.Desempleado;

public class DesempleadoMapper {
    public static DesempleadoDTO toDto(Desempleado desempleado){
        DesempleadoDTO desempleadoDTO = new DesempleadoDTO();
        desempleadoDTO.setContratos(desempleado.getContratos());
        desempleadoDTO.setPostulaciones(desempleado.getPostulaciones());
        desempleadoDTO.setProfesional(desempleado.getProfesional());
        desempleadoDTO.setUsuario(desempleado.getUsuario());
        desempleadoDTO.setId_desempleado(desempleado.getId_desempleado());
        return desempleadoDTO;
    }
    
    public static Desempleado toEntity(DesempleadoDTO desempleadoDTO){
        Desempleado desempleado = new Desempleado();
        desempleado.setContratos(desempleadoDTO.getContratos());
        desempleado.setPostulaciones(desempleadoDTO.getPostulaciones());
        desempleado.setProfesional(desempleadoDTO.getProfesional());
        desempleado.setUsuario(desempleadoDTO.getUsuario());
        desempleado.setId_desempleado(desempleadoDTO.getId_desempleado());
        return desempleado;
    }
}
