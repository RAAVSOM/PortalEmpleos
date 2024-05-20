package com.app.PortalEmpleos.persistence.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.ArrayList;
import lombok.Data;

@Data
@Entity
public class Contratista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_contratista;
    
    @OneToOne
    @JoinColumn(name="id_empresa")
    private Empresa empresa;
    
    @OneToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;
    
    @OneToMany(mappedBy = "contratista", cascade = CascadeType.ALL)
    private ArrayList<Vacante> vacantes;
}
