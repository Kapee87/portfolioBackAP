package com.portfolioNamontanerAp.namontaner.controller;

import com.portfolioNamontanerAp.namontaner.Interface.IEducacionService;
import com.portfolioNamontanerAp.namontaner.entity.Educacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class EducacionController {

    @Autowired
    IEducacionService educacionService;

    @GetMapping("/educacion/traer")

    public List<Educacion> getEducacion() {
        return educacionService.getEducacion();
    }

    @GetMapping("/educacion/traer/{id}")
    public Educacion getEducacionById(@PathVariable Long id) {
        return educacionService.findEducacion(id);
    }

    @PostMapping("/educacion/crear")
    public Educacion createEducacion(@RequestBody Educacion educacion) {
        educacionService.saveEducacion(educacion);
        return educacionService.findEducacion(educacion.getIdEdu());
    }

    @DeleteMapping("/educacion/borrar/{idEdu}")
    public Educacion deleteEducacion(@PathVariable Long idEdu) {
        educacionService.deleteEducacion(idEdu);
        return educacionService.findEducacion(idEdu);
    }

    @PutMapping("/educacion/editar/{id}")
    public Educacion UpdateEducacion(@RequestBody Educacion NewEducacion, @PathVariable Long id) {
        Educacion educacion = educacionService.findEducacion(id);
        educacion.setDescripcionEdu(NewEducacion.getDescripcionEdu());
        educacion.setFechaFinEdu(NewEducacion.getFechaFinEdu());
        educacion.setFechaIniEdu(NewEducacion.getFechaIniEdu());
        educacion.setImgEdu(NewEducacion.getImgEdu());
        educacion.setInstitucionEdu(NewEducacion.getInstitucionEdu());
        educacion.setTituloEdu(NewEducacion.getTituloEdu());
        educacionService.saveEducacion(educacion);
        return educacion;
    }

}
