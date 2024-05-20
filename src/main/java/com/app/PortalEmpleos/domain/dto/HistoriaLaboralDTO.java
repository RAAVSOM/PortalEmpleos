package com.app.PortalEmpleos.domain.dto;

import com.app.PortalEmpleos.persistence.entity.Profesional;
import java.util.Date;
import lombok.Data;

@Data
public class HistoriaLaboralDTO {
    private Long id_historia_laboral;
    private String cargo;
    private String lugar;
    private String año; 
    private Profesional profesional;
}
