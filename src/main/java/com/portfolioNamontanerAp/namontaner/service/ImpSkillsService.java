package com.portfolioNamontanerAp.namontaner.service;

import com.portfolioNamontanerAp.namontaner.Interface.ISkillsService;
import com.portfolioNamontanerAp.namontaner.entity.Skills;
import com.portfolioNamontanerAp.namontaner.repository.skillsRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpSkillsService implements ISkillsService {

    @Autowired
    private skillsRepository skillsRepo;

    @Override
    public List<Skills> getSkills() {
        List<Skills> skilles = skillsRepo.findAll();
        return skilles;
    }

    @Override
    public Skills saveSkills(Skills skills) {
        skillsRepo.save(skills);
        return skills;
    }

    @Override
    public void deleteSkills(Long id) {
        skillsRepo.deleteById(id);
    }

    @Override
    public Skills findSkill(Long id) {
        Skills skill = skillsRepo.findById(id).orElse(null);
        return skill;
    }

    @Override
    public void updateSkills(Skills skills) {
        skillsRepo.save(skills);
    }

    @Override
    public void deleteAllSkills() {
        skillsRepo.deleteAll();
    }
}
