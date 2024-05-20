package com.app.PortalEmpleos.domain.dto;

import lombok.Data;

@Data
public class PersonaDTO {
    private Long id_persona;
    private String nombre_persona;
    private String apellido_persona;
    private String ciudad;
    private float telefono;
    private boolean genero;
    private float cedula;
}
