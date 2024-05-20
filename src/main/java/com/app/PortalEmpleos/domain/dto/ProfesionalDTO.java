package com.app.PortalEmpleos.domain.dto;

import com.app.PortalEmpleos.persistence.entity.Certificado;
import com.app.PortalEmpleos.persistence.entity.HistoriaLaboral;
import com.app.PortalEmpleos.persistence.entity.Titulo;
import java.util.ArrayList;
import lombok.Data;

@Data
public class ProfesionalDTO {
    private Long id_profesional;
    private ArrayList<Titulo> titulos;
    private ArrayList<Certificado> certificados;
    private ArrayList<HistoriaLaboral> historiasLaborales;
}
