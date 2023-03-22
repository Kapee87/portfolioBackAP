package com.portfolioNamontanerAp.namontaner.controller;

import com.portfolioNamontanerAp.namontaner.Interface.ISkillsService;
import com.portfolioNamontanerAp.namontaner.entity.Skills;
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
public class SkillsController {

    @Autowired
    ISkillsService skillsService;

    @GetMapping("/skills/traerLista")
    public List<Skills> getSkills() {
        return skillsService.getSkills();
    }

    @GetMapping("/skills/traer/{id}")
    public Skills getSkillById(@PathVariable Long id) {
        return skillsService.findSkill(id);
    }

    @PostMapping("/skills/crear")
    public Skills createSkill(@RequestBody Skills skill) {
        skillsService.saveSkills(skill);
        return skill;
    }

    @PutMapping("/skills/editar/{id}")
    public Skills updateSkill(@PathVariable Long id, @RequestBody Skills newSkill) {
        Skills skill = skillsService.findSkill(id);
        skill.setNombreSkill(newSkill.getNombreSkill());
        skill.setFotoSkill(newSkill.getFotoSkill());
        skill.setPorcentaje(newSkill.getPorcentaje());
        skillsService.saveSkills(skill);
        return skill;
    }

    @DeleteMapping("/skills/borrar/{id}")
    public Skills deleteSkillById(@PathVariable Long id) {
        skillsService.deleteSkills(id);
        return skillsService.findSkill(id);
    }

    @DeleteMapping("skills/borrarTodo")
    public void deleteAllSkills() {
        skillsService.deleteAllSkills();
    }

}
