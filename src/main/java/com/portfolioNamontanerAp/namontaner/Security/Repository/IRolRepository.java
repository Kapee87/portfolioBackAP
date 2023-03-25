package com.portfolioNamontanerAp.namontaner.Security.Repository;

import com.portfolioNamontanerAp.namontaner.Security.Entity.Rol;
import com.portfolioNamontanerAp.namontaner.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {

    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
