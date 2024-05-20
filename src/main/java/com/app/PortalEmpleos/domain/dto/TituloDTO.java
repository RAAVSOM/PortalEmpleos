package com.app.PortalEmpleos.domain.dto;

import com.app.PortalEmpleos.persistence.entity.Profesional;
import lombok.Data;

@Data
public class TituloDTO {
    private Long id_titulo;
    private String titulo;
    private Profesional profesional;
}
