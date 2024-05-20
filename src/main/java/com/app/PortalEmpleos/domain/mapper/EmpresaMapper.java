package com.app.PortalEmpleos.domain.mapper;

import com.app.PortalEmpleos.domain.dto.EmpresaDTO;
import com.app.PortalEmpleos.persistence.entity.Empresa;

public class EmpresaMapper {
    public static EmpresaDTO toDto(Empresa empresa){
        EmpresaDTO empresaDTO = new EmpresaDTO();
        empresaDTO.setLink(empresa.getLink());
        empresaDTO.setLugar(empresa.getLugar());
        empresaDTO.setCalificacion(empresa.getCalificacion());
        empresaDTO.setPorcentaje_contratacion(empresa.getPorcentaje_contratacion());
        empresaDTO.setDescripcion_empresa(empresa.getDescripcion_empresa());
        empresaDTO.setNombre_empresa(empresa.getNombre_empresa());
        empresaDTO.setId_empresa(empresa.getId_empresa());
        return empresaDTO;
    }
    
    public static Empresa toEntity(EmpresaDTO empresaDTO){
        Empresa empresa = new Empresa();
        empresa.setLink(empresaDTO.getLink());
        empresa.setLugar(empresaDTO.getLugar());
        empresa.setCalificacion(empresaDTO.getCalificacion());
        empresa.setPorcentaje_contratacion(empresaDTO.getPorcentaje_contratacion());
        empresa.setDescripcion_empresa(empresaDTO.getDescripcion_empresa());
        empresa.setNombre_empresa(empresaDTO.getNombre_empresa());
        empresa.setId_empresa(empresaDTO.getId_empresa());
        return empresa;
    }
}
