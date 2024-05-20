package com.app.PortalEmpleos.domain.dto;

import com.app.PortalEmpleos.persistence.entity.Contratista;
import com.app.PortalEmpleos.persistence.entity.Desempleado;
import com.app.PortalEmpleos.persistence.entity.Empresa;
import java.util.List;
import lombok.Data;

@Data
public class VacanteDTO {
    private Long id_vacante;
    
    private String titulo;
    private String descripcion;
    private float salario;
    private String jornada;
    private String tiempo;
    private String lugar;
    private int experiencia;
    private int disponibles;
    private Empresa empresa;
    private Contratista contratista;
    private List<Desempleado> postulados;
    private List<Desempleado> contratados;
}
