package com.app.PortalEmpleos.domain.service;

import com.app.PortalEmpleos.domain.dto.UsuarioDTO;
import com.app.PortalEmpleos.domain.mapper.UsuarioMapper;
import com.app.PortalEmpleos.persistence.entity.Persona;
import com.app.PortalEmpleos.persistence.entity.Usuario;
import com.app.PortalEmpleos.persistence.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    public UsuarioDTO login(UsuarioDTO usuarioLogin){
        UsuarioDTO usuarioMal = new UsuarioDTO();
        usuarioMal.setPersona(new Persona());
        Usuario usuarioBd = usuarioRepository.findByCorreo(usuarioLogin.getCorreo());
        try{
            if(usuarioBd.getTipo_usuario() != null){
                if(verificarClave(usuarioLogin, usuarioBd)){
                    return UsuarioMapper.toDto(usuarioBd);
                }else{
                    usuarioMal.setTipo_usuario("Usuario o Contraseña Incorrectas");
                    return usuarioMal;
                }
            }
        }catch(Exception e){
            usuarioMal.setTipo_usuario("Usuario o Contraseña Incorrectas");
            return usuarioMal;
        }
        return usuarioMal;
    }
    
    private boolean verificarClave(UsuarioDTO usuarioLogin,Usuario usuarioBd){
        return usuarioBd.getClave().equals(usuarioLogin.getClave());
    }
}
