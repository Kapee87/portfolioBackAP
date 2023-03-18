package com.portfolioNamontanerAp.namontaner.controller;

import com.portfolioNamontanerAp.namontaner.Interface.IExperienciaService;
import com.portfolioNamontanerAp.namontaner.entity.Experiencia;
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
public class ExperienciaController {

    @Autowired
    IExperienciaService iExperienciaService;

    @GetMapping("/laboral/lista")
    public List<Experiencia> getExperiencias() {
        List<Experiencia> list = iExperienciaService.getExperiencia();
        return list;
    }

    @GetMapping("/laboral/experiencia/{id}")
    public Experiencia getExperienciaById(@PathVariable Long id) {
        return iExperienciaService.findExperiencia(id);
    }

    @PostMapping("/laboral/crear")
    public Experiencia crearExperiencia(@RequestBody Experiencia experiencia) {
        iExperienciaService.saveExperiencia(experiencia);
        return experiencia;
    }

    @DeleteMapping("/laboral/borrar/{id}")
    public Experiencia deleteExperiencia(@PathVariable Long id) {
        iExperienciaService.deleteExperiencia(id);
        return iExperienciaService.findExperiencia(id);
    }

    @DeleteMapping("/laboral/vaciar")
    public void deleteAll() {
        iExperienciaService.deleteAll();
    }

    @PutMapping("/laboral/editar/{id}")
    public Experiencia editarExperiencia(@PathVariable Long id, @RequestBody Experiencia newExperiencia) {
        Experiencia experiencia = iExperienciaService.findExperiencia(id);
        experiencia.setDescripcionExp(newExperiencia.getDescripcionExp());
        experiencia.setEmpresaExp(newExperiencia.getEmpresaExp());
        experiencia.setFechaFinExp(newExperiencia.getFechaFinExp());
        experiencia.setFechaIniExp(newExperiencia.getFechaIniExp());
        experiencia.setImgExp(newExperiencia.getImgExp());
        experiencia.setTituloExp(newExperiencia.getTituloExp());
        iExperienciaService.updateExperiencia(experiencia);
        return experiencia;
    }
}
