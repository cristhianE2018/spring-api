package com.seguridad.aplicacion.repositories;

import com.seguridad.aplicacion.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioLibros extends JpaRepository<Libro,String> {

}
