package com.portfolioNamontanerAp.namontaner.service;

import com.portfolioNamontanerAp.namontaner.Interface.IEducacionService;
import com.portfolioNamontanerAp.namontaner.entity.Educacion;
import com.portfolioNamontanerAp.namontaner.repository.educacionRepository;
import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpEducacionService implements IEducacionService {

    @Autowired
    private educacionRepository eduRepo;

    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> educaciones = eduRepo.findAll();
        return educaciones;
    }

    @Override
    public Educacion saveEducacion(Educacion educacion) {
        eduRepo.save(educacion);
        return educacion;
    }

    @Override
    public void deleteEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
        Educacion educacion = eduRepo.findById(id).orElse(null);
        return educacion;
    }

    @Override
    public void updateEducacion(Educacion educacion) {
        eduRepo.save(educacion);
    }

}
