package com.app.PortalEmpleos.persistence.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    
    @Column(unique = true)
    private String correo;
    private String clave;
    private String tipo_usuario;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_persona")
    private Persona persona;
    
}
