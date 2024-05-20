package com.app.PortalEmpleos.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Titulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_titulo;
    
    private String titulo;
    
    @ManyToOne
    @JoinColumn(name = "id_profesional")
    private Profesional profesional;
    
}
