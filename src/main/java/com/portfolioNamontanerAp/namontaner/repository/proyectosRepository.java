package com.portfolioNamontanerAp.namontaner.repository;

import com.portfolioNamontanerAp.namontaner.entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface proyectosRepository extends JpaRepository<Proyectos, Long> {

}
