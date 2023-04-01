package com.portfolioNamontanerAp.namontaner.repository;

import com.portfolioNamontanerAp.namontaner.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {

}
