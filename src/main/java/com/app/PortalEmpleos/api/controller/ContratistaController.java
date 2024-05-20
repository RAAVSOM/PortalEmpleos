package com.app.PortalEmpleos.api.controller;

import com.app.PortalEmpleos.domain.dto.ContratistaDTO;
import com.app.PortalEmpleos.domain.dto.UsuarioDTO;
import com.app.PortalEmpleos.domain.service.ContratistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contratista")
public class ContratistaController {
    @Autowired
    private ContratistaService contratistaService;
    
    @PostMapping
    public ContratistaDTO loginContratista(@RequestBody UsuarioDTO usuarioDTO){
        return contratistaService.loginContratista(usuarioDTO);
    }
}
