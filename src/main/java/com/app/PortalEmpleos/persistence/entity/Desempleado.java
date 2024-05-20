package com.app.PortalEmpleos.persistence.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
@Entity
public class Desempleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_desempleado;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_usuario")
    private Usuario usuario;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_profesional")
    private Profesional profesional;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "desempleado_postulaciones",
            joinColumns = @JoinColumn(name = "desempleado_id", referencedColumnName = "id_desempleado"),
            inverseJoinColumns = @JoinColumn(name = "postulacion_id", referencedColumnName = "id_vacante"))
    private List<Vacante> postulaciones;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "desempleado_contratos",
            joinColumns = @JoinColumn(name = "desempleado_id", referencedColumnName = "id_desempleado"),
            inverseJoinColumns = @JoinColumn(name = "contrato_id", referencedColumnName = "id_vacante"))
    private List<Vacante> contratos;
    
}
