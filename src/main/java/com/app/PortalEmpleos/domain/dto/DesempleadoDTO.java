package com.app.PortalEmpleos.domain.dto;

import com.app.PortalEmpleos.persistence.entity.Profesional;
import com.app.PortalEmpleos.persistence.entity.Usuario;
import com.app.PortalEmpleos.persistence.entity.Vacante;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class DesempleadoDTO {
    private Long id_desempleado;
    private Usuario usuario;
    private Profesional profesional;
    private List<Vacante> postulaciones;
    private List<Vacante> contratos;
}
