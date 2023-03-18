package com.portfolioNamontanerAp.namontaner.service;

import com.portfolioNamontanerAp.namontaner.Interface.IProyectosService;
import com.portfolioNamontanerAp.namontaner.entity.Proyectos;
import com.portfolioNamontanerAp.namontaner.repository.proyectosRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpProyectosService implements IProyectosService {

    @Autowired
    private proyectosRepository ProyectosRepo;

    @Override
    public List<Proyectos> getProyectos() {
        List<Proyectos> proyectos = ProyectosRepo.findAll();
        return proyectos;
    }

    @Override
    public Proyectos saveProyectos(Proyectos proyecto) {
        ProyectosRepo.save(proyecto);
        return proyecto;
    }

    @Override
    public void deleteProyectos(Long id) {
        ProyectosRepo.deleteById(id);
    }

    @Override
    public Proyectos findProyecto(Long id) {
        Proyectos proyecto = ProyectosRepo.findById(id).orElse(null);
        return proyecto;
    }

    @Override
    public void updateProyectos(Proyectos proyectos) {
        ProyectosRepo.save(proyectos);
    }

    @Override
    public void vaciarProyectos() {
        ProyectosRepo.deleteAll();
    }
}
