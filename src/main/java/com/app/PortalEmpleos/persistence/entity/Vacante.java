package com.app.PortalEmpleos.persistence.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
@Entity
public class Vacante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_vacante;
    
    private String titulo;
    private String descripcion;
    private float salario;
    private String jornada;
    private String tiempo;
    private String lugar;
    private int experiencia;
    private int disponibles;
    
    @OneToOne
    @JoinColumn(name="id_empresa")
    private Empresa empresa;
    
    @ManyToOne
    @JoinColumn(name = "id_contratista")
    private Contratista contratista;
    
    @ManyToMany(mappedBy = "postulaciones",cascade = CascadeType.ALL)
    private List<Desempleado> postulados;
    
    @ManyToMany(mappedBy = "contratos",cascade = CascadeType.ALL)
    private List<Desempleado> contratados;
    
    
}
