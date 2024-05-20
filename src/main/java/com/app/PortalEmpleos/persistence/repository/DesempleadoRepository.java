package com.app.PortalEmpleos.persistence.repository;

import com.app.PortalEmpleos.persistence.entity.Desempleado;
import com.app.PortalEmpleos.persistence.entity.Usuario;
import com.app.PortalEmpleos.persistence.entity.Vacante;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesempleadoRepository extends JpaRepository<Desempleado, Long> {
    public List<Desempleado> findByPostulaciones(Vacante vacante);
    public List<Desempleado> findByContratos(Vacante vacante);
    public Desempleado findByUsuario(Usuario usuario);
}
