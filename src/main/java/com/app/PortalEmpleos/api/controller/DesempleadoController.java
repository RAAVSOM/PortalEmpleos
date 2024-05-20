package com.app.PortalEmpleos.api.controller;

import com.app.PortalEmpleos.domain.dto.DesempleadoDTO;
import com.app.PortalEmpleos.domain.dto.UsuarioDTO;
import com.app.PortalEmpleos.domain.service.DesempleadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class DesempleadoController {
    
    @Autowired
    private DesempleadoService desempleadoService;
    
    
    @PostMapping("/registrar")
    public DesempleadoDTO registrar(@RequestBody DesempleadoDTO desempleadoDTO){
        return desempleadoService.crearDesempleado(desempleadoDTO);
    }
    
    @PutMapping
    public String actualizarDatos(@RequestBody DesempleadoDTO desempleadoDTO){
        return desempleadoService.actualizarPerfil(desempleadoDTO);
    }
    
    //--------funciones del Contratista---------
    @GetMapping("/postulaciones/{id}")
    public List<DesempleadoDTO> getPostulaciones(@PathVariable Long id){
        return desempleadoService.getPostulaciones(id);
    }
    
    @GetMapping("/contratos/{id}")
    public List<DesempleadoDTO> getContratos(@PathVariable Long id){
        return desempleadoService.getContratos(id);
    }
    
    @GetMapping("/{id}")
    public DesempleadoDTO getDesempleado(@PathVariable Long id){
        return desempleadoService.getDesempleado(id);
    }
    
    @PostMapping
    public DesempleadoDTO loginDesempleado(@RequestBody UsuarioDTO usuarioDTO){
        return desempleadoService.loginDesempleado(usuarioDTO);
    }
}
