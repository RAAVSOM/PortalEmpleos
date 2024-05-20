package com.app.PortalEmpleos.domain.service;

import com.app.PortalEmpleos.domain.dto.ContratistaDTO;
import com.app.PortalEmpleos.domain.dto.UsuarioDTO;
import com.app.PortalEmpleos.domain.mapper.ContratistaMapper;
import com.app.PortalEmpleos.domain.mapper.UsuarioMapper;
import com.app.PortalEmpleos.persistence.repository.ContratistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContratistaService {
    @Autowired
    private ContratistaRepository contratistaRepository;
    
    public ContratistaDTO loginContratista(UsuarioDTO usuarioDTO){
        return ContratistaMapper.toDto(contratistaRepository.findByUsuario(UsuarioMapper.toEntity(usuarioDTO)));
    }
}
