package com.app.PortalEmpleos.domain.mapper;

import com.app.PortalEmpleos.domain.dto.PersonaDTO;
import com.app.PortalEmpleos.persistence.entity.Persona;

public class PersonaMapper {
    public static PersonaDTO toDto(Persona persona){
        PersonaDTO personaDTO = new PersonaDTO();
        personaDTO.setCedula(persona.getCedula());
        personaDTO.setGenero(persona.isGenero());
        personaDTO.setTelefono(persona.getTelefono());
        personaDTO.setCiudad(persona.getCiudad());
        personaDTO.setApellido_persona(persona.getApellido_persona());
        personaDTO.setNombre_persona(persona.getNombre_persona());
        personaDTO.setId_persona(persona.getId_persona());
        return personaDTO;
    }
    
    public static Persona toEntity(PersonaDTO personaDTO){
        Persona persona = new Persona();
        persona.setCedula(personaDTO.getCedula());
        persona.setGenero(personaDTO.isGenero());
        persona.setTelefono(personaDTO.getTelefono());
        persona.setCiudad(personaDTO.getCiudad());
        persona.setApellido_persona(personaDTO.getApellido_persona());
        persona.setNombre_persona(personaDTO.getNombre_persona());
        persona.setId_persona(personaDTO.getId_persona());
        return persona;
    }
}
