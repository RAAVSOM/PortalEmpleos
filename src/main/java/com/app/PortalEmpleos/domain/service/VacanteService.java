package com.app.PortalEmpleos.domain.service;

import com.app.PortalEmpleos.domain.dto.ContratistaDTO;
import com.app.PortalEmpleos.domain.dto.DesempleadoDTO;
import com.app.PortalEmpleos.domain.dto.VacanteDTO;
import com.app.PortalEmpleos.domain.mapper.DesempleadoMapper;
import com.app.PortalEmpleos.domain.mapper.VacanteMapper;
import com.app.PortalEmpleos.persistence.entity.Desempleado;
import com.app.PortalEmpleos.persistence.entity.Vacante;
import com.app.PortalEmpleos.persistence.repository.DesempleadoRepository;
import com.app.PortalEmpleos.persistence.repository.VacanteRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VacanteService {
    @Autowired
    private VacanteRepository vacanteRepository;
    
    @Autowired
    private DesempleadoRepository desempleadoRepository;
    
    //------funciones del Desempleado---------
    public List<VacanteDTO> getAllVacantes(){
        return vacanteRepository.findAll().stream().map(VacanteMapper::toDto).collect(Collectors.toList());
    }
    
    public VacanteDTO getVacante(Long id_vacante){
        return VacanteMapper.toDto(vacanteRepository.findById(id_vacante).orElse(null));
    } 
    
    @Transactional
    public VacanteDTO postularseAvacante(Long id_desempleado, Long id_vacante){
        Vacante vacante = vacanteRepository.findById(id_vacante).orElse(null);
        
        List<Vacante> vacantesVacias = new ArrayList<>();
        List<Desempleado> desempleadosVacios = new ArrayList<>();
        
        vacante.setContratados(desempleadosVacios);
        vacante.setPostulados(desempleadosVacios);
        
        Desempleado desempleado = desempleadoRepository.findById(id_desempleado).orElse(null);
        
        desempleado.getPostulaciones().add(vacante);
        desempleadoRepository.save(desempleado);
        
        desempleado.setContratos(vacantesVacias);
        desempleado.setPostulaciones(vacantesVacias);
        
        List<Desempleado> postulados = vacante.getPostulados();
        postulados.add(desempleado);
        vacante.setPostulados(postulados);
       
        return VacanteMapper.toDto(vacanteRepository.save(vacante));
    }
    
    public List<VacanteDTO> getAllPostulaciones(DesempleadoDTO desempleadoDTO){
        return vacanteRepository.findByPostulados(DesempleadoMapper.toEntity(desempleadoDTO)).stream().map(VacanteMapper::toDto).collect(Collectors.toList());
    }
    
    public List<VacanteDTO> getAllContrataciones(DesempleadoDTO desempleadoDTO){
        return vacanteRepository.findByContratados(DesempleadoMapper.toEntity(desempleadoDTO)).stream().map(VacanteMapper::toDto).collect(Collectors.toList());
    }
    
    
    //--------funciones del Contratista-----------
    public String crearVacante(VacanteDTO vacanteDTO){
        try{
            vacanteRepository.save(VacanteMapper.toEntity(vacanteDTO));
            return "Creacion exitoso";
        }catch(Exception e){
            return "Error de creacion";
        }
    }
    
    public List<VacanteDTO> getAllVacantesPorEmpresa(ContratistaDTO contratistaDTO){
        return vacanteRepository.findByEmpresa(contratistaDTO.getEmpresa()).stream().map(VacanteMapper::toDto).collect(Collectors.toList());
    }
    
}
