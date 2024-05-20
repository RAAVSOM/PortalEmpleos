package com.app.PortalEmpleos;

import com.app.PortalEmpleos.domain.dto.UsuarioDTO;
import com.app.PortalEmpleos.domain.mapper.UsuarioMapper;
import com.app.PortalEmpleos.persistence.entity.Contratista;
import com.app.PortalEmpleos.persistence.entity.Desempleado;
import com.app.PortalEmpleos.persistence.entity.Empresa;
import com.app.PortalEmpleos.persistence.entity.Usuario;
import com.app.PortalEmpleos.persistence.entity.Vacante;
import com.app.PortalEmpleos.persistence.repository.ContratistaRepository;
import com.app.PortalEmpleos.persistence.repository.DesempleadoRepository;
import com.app.PortalEmpleos.persistence.repository.EmpresaRepository;
import com.app.PortalEmpleos.persistence.repository.UsuarioRepository;
import com.app.PortalEmpleos.persistence.repository.VacanteRepository;
import jakarta.persistence.EntityManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Configuration
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    
    @Bean
    CommandLineRunner initDatabase(DesempleadoRepository desempleadoRepository,
            ContratistaRepository contratistaRepository,
            VacanteRepository vacanteRepository,
            EmpresaRepository empresaRepository,
            UsuarioRepository usuarioRepository,
            EntityManager entityManager,
            PlatformTransactionManager transactionManager){
        return arg ->{
            TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());
        
            Usuario usuario = new Usuario();
            usuario.setCorreo("hola");
            usuario.setClave("123");
            usuario.setTipo_usuario("desempleado");

            entityManager.persist(usuario);

            Desempleado desempleado = new Desempleado();
            desempleado.setUsuario(usuario);
            desempleadoRepository.save(desempleado);

            
            
            
            Empresa empresa = new Empresa();
            empresa.setLink("ww.empresaStak.es");
            empresa.setLugar("cartagena");
            empresa.setCalificacion(5);
            empresa.setPorcentaje_contratacion(46);
            empresa.setDescripcion_empresa("Empresa patrocinadora de Desarrollo de nuevas tecnologias en la ciudad de cartagena");
            empresa.setNombre_empresa("Stark Industries");
            
            entityManager.persist(empresa);
            
            Usuario usuarioC = new Usuario();
            usuarioC.setCorreo("chao");
            usuarioC.setClave("123");
            
            entityManager.persist(usuarioC);
            
            Contratista contratista = new Contratista();
            contratista.setUsuario(usuarioC);
            contratista.setEmpresa(empresa);
            
            usuarioRepository.save(usuarioC);
            contratistaRepository.save(contratista);
            
            Vacante vacante = new Vacante();
            vacante.setEmpresa(empresa);
            vacante.setDisponibles(5);
            vacante.setExperiencia(6);
            vacante.setLugar("barranquilla");
            vacante.setTiempo("6 horas");
            vacante.setJornada("tarde");
            vacante.setSalario(123545345);
            vacante.setDescripcion("Se busca desallolador de software en barranquilla");
            vacante.setTitulo("Se busca Programador");
            
            vacanteRepository.save(vacante);
            
            transactionManager.commit(status);
        };
    }

}
