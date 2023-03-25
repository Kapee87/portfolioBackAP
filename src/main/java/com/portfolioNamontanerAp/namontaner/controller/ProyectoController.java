package com.portfolioNamontanerAp.namontaner.controller;

import com.portfolioNamontanerAp.namontaner.Interface.IProyectosService;
import com.portfolioNamontanerAp.namontaner.entity.Proyectos;
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
public class ProyectoController {

    @Autowired
    IProyectosService iProyectosService;

    @GetMapping("/proyectos/lista")
    public List<Proyectos> getProyectos() {
        return iProyectosService.getProyectos();
    }

    @GetMapping("/proyectos/traer/{id}")
    public Proyectos getSkillById(@PathVariable Long id) {
        return iProyectosService.findProyecto(id);
    }

    @PostMapping("/proyectos/crear")
    public Proyectos createProyecto(@RequestBody Proyectos proyecto) {
        iProyectosService.saveProyectos(proyecto);
        return proyecto;
    }

    @PutMapping("/proyectos/editar/{id}")
    public Proyectos updateSkill(@PathVariable Long id, @RequestBody Proyectos newProyecto) {
        Proyectos proyecto = iProyectosService.findProyecto(id);
        proyecto.setNombreProyecto(newProyecto.getNombreProyecto());
        proyecto.setDescripcionProyecto(newProyecto.getDescripcionProyecto());
        proyecto.setImg_proyecto(newProyecto.getImg_proyecto());
        proyecto.setUrlProyecto(newProyecto.getUrlProyecto());
        iProyectosService.saveProyectos(proyecto);
        return proyecto;
    }

    @DeleteMapping("/proyectos/borrar/{id}")
    public Proyectos deleteSkillById(@PathVariable Long id) {
        iProyectosService.deleteProyectos(id);
        return iProyectosService.findProyecto(id);
    }

    @DeleteMapping("proyectos/borrarTodo")
    public void deleteAllProyecto() {
        iProyectosService.vaciarProyectos();
    }

}
