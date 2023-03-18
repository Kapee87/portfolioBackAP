package com.portfolioNamontanerAp.namontaner.Interface;

import com.portfolioNamontanerAp.namontaner.entity.Experiencia;
import java.util.List;

public interface IExperienciaService {

    public List<Experiencia> getExperiencia();

    public Experiencia saveExperiencia(Experiencia experiencia);

    public void deleteExperiencia(Long id);

    public void deleteAll();

    public Experiencia findExperiencia(Long id);

    public void updateExperiencia(Experiencia experiencia);
}
