package com.seguridad.aplicacion.repositories;

import com.seguridad.aplicacion.models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepositorioAlumnos extends JpaRepository<Alumno,String> {


}
