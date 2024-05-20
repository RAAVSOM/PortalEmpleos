package com.app.PortalEmpleos.persistence.repository;

import com.app.PortalEmpleos.persistence.entity.Contratista;
import com.app.PortalEmpleos.persistence.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratistaRepository extends JpaRepository<Contratista, Long>{
    public Contratista findByUsuario(Usuario usuario);
}
