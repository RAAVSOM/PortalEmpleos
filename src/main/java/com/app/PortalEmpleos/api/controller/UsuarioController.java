
package com.app.PortalEmpleos.api.controller;

import com.app.PortalEmpleos.domain.dto.UsuarioDTO;
import com.app.PortalEmpleos.domain.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    
    
    @PostMapping("/login")
    public UsuarioDTO loguear(@RequestBody UsuarioDTO usuarioDTO){
        return usuarioService.login(usuarioDTO);
    }
}
