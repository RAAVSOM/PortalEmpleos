
package com.app.PortalEmpleos.persistence.repository;

import com.app.PortalEmpleos.persistence.entity.Desempleado;
import com.app.PortalEmpleos.persistence.entity.Empresa;
import com.app.PortalEmpleos.persistence.entity.Vacante;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacanteRepository extends JpaRepository<Vacante, Long>{
    public List<Vacante> findByPostulados(Desempleado desempleado);

    public List<Vacante> findByContratados(Desempleado desempleado);
    
    public List<Vacante> findByEmpresa(Empresa empresa);
}
