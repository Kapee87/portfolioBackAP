package com.portfolioNamontanerAp.namontaner.Interface;

import com.portfolioNamontanerAp.namontaner.entity.Educacion;
import java.util.List;

public interface IEducacionService {

    public List<Educacion> getEducacion();

    public Educacion saveEducacion(Educacion educacion);

    public void deleteEducacion(Long id);

    public Educacion findEducacion(Long id);

    public void updateEducacion(Educacion educacion);

}
