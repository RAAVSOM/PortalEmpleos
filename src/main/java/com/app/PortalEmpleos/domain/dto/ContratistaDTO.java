package com.app.PortalEmpleos.domain.dto;

import com.app.PortalEmpleos.persistence.entity.Empresa;
import com.app.PortalEmpleos.persistence.entity.Usuario;
import com.app.PortalEmpleos.persistence.entity.Vacante;
import java.util.ArrayList;
import lombok.Data;

@Data
public class ContratistaDTO {
    private Long id_contratista;
    private Empresa empresa;
    private Usuario usuario;
    private ArrayList<Vacante> vacantes;
}
