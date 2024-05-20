package com.app.PortalEmpleos.domain.dto;

import com.app.PortalEmpleos.persistence.entity.Persona;
import lombok.Data;

@Data
public class UsuarioDTO {
    private Long id_usuario;
    private String correo;
    private String clave;
    private String tipo_usuario;
    private Persona persona;
}
