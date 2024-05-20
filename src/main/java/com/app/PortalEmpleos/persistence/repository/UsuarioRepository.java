package com.app.PortalEmpleos.persistence.repository;

import com.app.PortalEmpleos.persistence.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    public Usuario findByCorreo(String correo);
}
