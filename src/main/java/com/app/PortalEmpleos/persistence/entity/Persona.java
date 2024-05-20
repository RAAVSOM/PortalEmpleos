package com.app.PortalEmpleos.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;
    private String nombre_persona;
    private String apellido_persona;
    private String ciudad;
    private float telefono;
    private boolean genero;
    private float cedula;
}
