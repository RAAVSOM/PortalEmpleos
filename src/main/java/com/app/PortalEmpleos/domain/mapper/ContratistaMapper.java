package com.app.PortalEmpleos.domain.mapper;

import com.app.PortalEmpleos.domain.dto.ContratistaDTO;
import com.app.PortalEmpleos.persistence.entity.Contratista;

public class ContratistaMapper {
    public static ContratistaDTO toDto(Contratista contratista){
        ContratistaDTO contratistaDTO = new ContratistaDTO();
        contratistaDTO.setVacantes(contratista.getVacantes());
        contratistaDTO.setUsuario(contratista.getUsuario());
        contratistaDTO.setEmpresa(contratista.getEmpresa());
        contratistaDTO.setId_contratista(contratista.getId_contratista());
        return contratistaDTO;
    }
    
    public static Contratista toEntity(ContratistaDTO contratistaDTO){
        Contratista contratista = new Contratista();
        contratista.setVacantes(contratistaDTO.getVacantes());
        contratista.setUsuario(contratistaDTO.getUsuario());
        contratista.setEmpresa(contratistaDTO.getEmpresa());
        contratista.setId_contratista(contratistaDTO.getId_contratista());
        return contratista;
    }
}
