package com.seguridad.aplicacion.repositories;

import com.seguridad.aplicacion.models.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioPrestamos extends JpaRepository<Prestamo, Integer> {
}
