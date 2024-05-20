package com.app.PortalEmpleos.domain.service;

import com.app.PortalEmpleos.domain.dto.DesempleadoDTO;
import com.app.PortalEmpleos.domain.dto.UsuarioDTO;
import com.app.PortalEmpleos.domain.mapper.DesempleadoMapper;
import com.app.PortalEmpleos.domain.mapper.UsuarioMapper;
import com.app.PortalEmpleos.persistence.repository.DesempleadoRepository;
import com.app.PortalEmpleos.persistence.repository.VacanteRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DesempleadoService {
    @Autowired
    private DesempleadoRepository desempleadoRepository;
    @Autowired
    private VacanteRepository vacanteRepository;
    
    public DesempleadoDTO crearDesempleado(DesempleadoDTO desempleadoDTO){
        return DesempleadoMapper.toDto(desempleadoRepository.save(DesempleadoMapper.toEntity(desempleadoDTO)));
    }
    
    public String actualizarPerfil(DesempleadoDTO desempleadoDTO){
        desempleadoRepository.save(DesempleadoMapper.toEntity(desempleadoDTO));
        return "Datos Actualizados Exitosamente";
    }
    
    public DesempleadoDTO loginDesempleado(UsuarioDTO usuarioDTO){
        return DesempleadoMapper.toDto(desempleadoRepository.findByUsuario(UsuarioMapper.toEntity(usuarioDTO)));
    }
    
    
    
    //--------funciones del Contratista---------
    public List<DesempleadoDTO> getPostulaciones(Long id){
        return desempleadoRepository.findByPostulaciones(vacanteRepository.findById(id).orElse(null)).stream().map(DesempleadoMapper::toDto).collect(Collectors.toList());
    }
    
    public List<DesempleadoDTO> getContratos(Long id){
        return desempleadoRepository.findByContratos(vacanteRepository.findById(id).orElse(null)).stream().map(DesempleadoMapper::toDto).collect(Collectors.toList());
    }
    
    public DesempleadoDTO getDesempleado(Long id_desempleado){
        return DesempleadoMapper.toDto(desempleadoRepository.findById(id_desempleado).orElse(null));
    }
}
