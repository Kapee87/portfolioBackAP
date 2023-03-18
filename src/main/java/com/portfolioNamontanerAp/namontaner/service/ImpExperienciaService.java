package com.portfolioNamontanerAp.namontaner.service;
import com.portfolioNamontanerAp.namontaner.Interface.IExperienciaService;
import com.portfolioNamontanerAp.namontaner.entity.Experiencia;
import com.portfolioNamontanerAp.namontaner.repository.experienciaRepository;

import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpExperienciaService implements IExperienciaService {

    @Autowired
    private experienciaRepository ExpRepo;

    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> experiencias = ExpRepo.findAll();
        return experiencias;
    }

    @Override
    public Experiencia saveExperiencia(Experiencia experiencia) {
        ExpRepo.save(experiencia);
        return experiencia;
    }

    @Override
    public void deleteExperiencia(Long id) {
        ExpRepo.deleteById(id);
    }

    @Override
    public void deleteAll() {
        ExpRepo.deleteAll();
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia experiencia = ExpRepo.findById(id).orElse(null);
        return experiencia;
    }

    @Override
    public void updateExperiencia(Experiencia experiencia) {
        ExpRepo.save(experiencia);
    }

}
