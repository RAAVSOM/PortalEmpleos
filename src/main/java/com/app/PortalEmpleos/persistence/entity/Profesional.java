package com.app.PortalEmpleos.persistence.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import lombok.Data;

@Data
@Entity
public class Profesional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_profesional;
    
    @OneToMany(mappedBy = "profesional", cascade = CascadeType.ALL)
    private ArrayList<Titulo> titulos;
    
    @OneToMany(mappedBy = "profesional", cascade = CascadeType.ALL)
    private ArrayList<Certificado> certificados;
    
    @OneToMany(mappedBy = "profesional", cascade = CascadeType.ALL)
    private ArrayList<HistoriaLaboral> historiasLaborales;
    
}
