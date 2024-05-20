package com.app.PortalEmpleos.api.controller;

import com.app.PortalEmpleos.domain.dto.ContratistaDTO;
import com.app.PortalEmpleos.domain.dto.DesempleadoDTO;
import com.app.PortalEmpleos.domain.dto.VacanteDTO;
import com.app.PortalEmpleos.domain.service.VacanteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/vacante")
public class VacanteController {
    @Autowired
    private VacanteService vacanteService;
    
    @GetMapping
    public List<VacanteDTO> getAllVacantes(){
        return vacanteService.getAllVacantes();
    }
    
    @GetMapping("/{id}")
    public VacanteDTO getVacante(@PathVariable Long id){
        return vacanteService.getVacante(id);
    }
    
    @PostMapping("/postularse/{id_desempleado}/{id_vacante}")
    public VacanteDTO postularseAvacante(@PathVariable Long id_desempleado,@PathVariable Long id_vacante){
        return vacanteService.postularseAvacante(id_desempleado, id_vacante);
    }
    
    @PostMapping("/postulaciones")
    public List<VacanteDTO> getAllPostulaciones(@RequestBody DesempleadoDTO desempleadoDTO){
        return vacanteService.getAllPostulaciones(desempleadoDTO);
    }
    
    @PostMapping("/contrataciones")
    public List<VacanteDTO> getAllContrataciones(@RequestBody DesempleadoDTO desempleadoDTO){
        return vacanteService.getAllContrataciones(desempleadoDTO);
    }
    
    @PostMapping
    public String crearVacante(@RequestBody VacanteDTO vacanteDTO){
        return vacanteService.crearVacante(vacanteDTO);
    }
    
    @PostMapping("/byempresa")
    public List<VacanteDTO> getAllVacantesPorEmpresa(ContratistaDTO contratistaDTO){
        return vacanteService.getAllVacantesPorEmpresa(contratistaDTO);
    }
    
    
    
    
}
