package com.app.PortalEmpleos.domain.dto;

import lombok.Data;

@Data
public class EmpresaDTO {
    private Long id_empresa;
    private String nombre_empresa;
    private String descripcion_empresa;
    private float porcentaje_contratacion;
    private float calificacion;
    private String lugar;
    private String link;
}
