
package com.portfolioNamontanerAp.namontaner.repository;

import com.portfolioNamontanerAp.namontaner.entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface skillsRepository extends JpaRepository<Skills, Long> {

}