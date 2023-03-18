package com.portfolioNamontanerAp.namontaner.controller;

import com.portfolioNamontanerAp.namontaner.Interface.IPersonaService;
import com.portfolioNamontanerAp.namontaner.entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

  @Autowired
    IPersonaService iPersonaService;

    @GetMapping("/personas/lista")
    public List<Persona> getPersona() {
        return iPersonaService.getPersona();
    }

    @GetMapping("/personas/traer/{id}")
    public Persona getPersonaById(@PathVariable Long id) {
        return iPersonaService.findPersona(id);
    }

    @PostMapping("/personas/crear")
    public Persona createPersona(@RequestBody Persona persona) {
        iPersonaService.savePersona(persona);
        return persona;
    }

    @DeleteMapping("/personas/borrar/{id}")
    public Persona deletePersona(@PathVariable Long id) {
        iPersonaService.deletePersona(id);
        return iPersonaService.findPersona(id);
    }

    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@RequestBody Persona newPersona, @PathVariable Long id) {
        Persona persona = iPersonaService.findPersona(id);
        persona.setNombre(newPersona.getNombre());
        persona.setApellido(newPersona.getApellido());
        persona.setFechaNac(newPersona.getFechaNac());
        persona.setTelefono(newPersona.getTelefono());
        persona.setCorreo(newPersona.getCorreo());
        persona.setDescripcion(newPersona.getDescripcion());
        persona.setUrlFoto(newPersona.getUrlFoto());

        iPersonaService.savePersona(persona);
        return persona;
    }

    @DeleteMapping("/personas/vaciar")
    public void deleteAll() {
        iPersonaService.deleteAll();
    }

}
