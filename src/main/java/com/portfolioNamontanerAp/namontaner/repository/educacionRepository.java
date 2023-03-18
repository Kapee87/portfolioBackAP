package com.portfolioNamontanerAp.namontaner.repository;

import com.portfolioNamontanerAp.namontaner.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface educacionRepository extends JpaRepository<Educacion, Long> {

}
