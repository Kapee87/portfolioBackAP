package com.portfolioNamontanerAp.namontaner.Security.Repository;

import com.portfolioNamontanerAp.namontaner.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByNombreUsuario(String NombreUsuario);

    boolean existsByNombreUsuario(String NombreUsuario);

    boolean existsByEmail(String email);

}
