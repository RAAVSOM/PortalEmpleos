package com.app.PortalEmpleos.domain.mapper;

import com.app.PortalEmpleos.domain.dto.UsuarioDTO;
import com.app.PortalEmpleos.persistence.entity.Usuario;

public class UsuarioMapper {
    public static UsuarioDTO toDto(Usuario usuario){
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setPersona(usuario.getPersona());
        usuarioDTO.setTipo_usuario(usuario.getTipo_usuario());
        usuarioDTO.setClave(usuario.getClave());
        usuarioDTO.setCorreo(usuario.getCorreo());
        usuarioDTO.setId_usuario(usuario.getId_usuario());
        return usuarioDTO;
    }
    
    public static Usuario toEntity(UsuarioDTO usuarioDTO){
        Usuario usuario = new Usuario();
        usuario.setPersona(usuarioDTO.getPersona());
        usuario.setTipo_usuario(usuarioDTO.getTipo_usuario());
        usuario.setClave(usuarioDTO.getClave());
        usuario.setCorreo(usuarioDTO.getCorreo());
        usuario.setId_usuario(usuarioDTO.getId_usuario());
        return usuario;
    }
}
