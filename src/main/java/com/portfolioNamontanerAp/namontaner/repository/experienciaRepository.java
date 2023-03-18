package com.portfolioNamontanerAp.namontaner.repository;

import com.portfolioNamontanerAp.namontaner.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface experienciaRepository extends JpaRepository<Experiencia, Long> {

}
