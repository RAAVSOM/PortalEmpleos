package com.app.PortalEmpleos.domain.dto;

import com.app.PortalEmpleos.persistence.entity.Profesional;
import lombok.Data;

@Data
public class CertificadoDTO {
    private Long id_certificado;
    private String certificado;
    private Profesional profesional;
}
