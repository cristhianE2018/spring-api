package com.seguridad.aplicacion.repositories;

import com.seguridad.aplicacion.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findOneByEmail(String email);

}
