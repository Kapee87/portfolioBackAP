package com.portfolioNamontanerAp.namontaner.service;

import com.portfolioNamontanerAp.namontaner.Interface.IPersonaService;
import com.portfolioNamontanerAp.namontaner.entity.Persona;
import com.portfolioNamontanerAp.namontaner.repository.IPersonaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpPersonaService implements IPersonaService {

    @Autowired
    public IPersonaRepository ipersonaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public Persona savePersona(Persona persona) {
        ipersonaRepository.save(persona);
        return persona;
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }

    @Override
    public void deleteAll() {
        ipersonaRepository.deleteAll();
    }

}
