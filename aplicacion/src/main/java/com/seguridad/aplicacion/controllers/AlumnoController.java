package com.seguridad.aplicacion.controllers;

import com.seguridad.aplicacion.models.Alumno;
import com.seguridad.aplicacion.repositories.RepositorioAlumnos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AlumnoController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AlumnoController.class);

    RepositorioAlumnos repoAlumnos;

    public AlumnoController(RepositorioAlumnos repoAlumnos) {
        this.repoAlumnos = repoAlumnos;
    }

    @GetMapping("alumnos")
    public List<Alumno> getAlumnos() {
        return this.repoAlumnos.findAll();
    }

    @GetMapping("alumnos/{numeroControl}")
    public ResponseEntity<Alumno> getAlumnoById(@PathVariable("numeroControl") String numeroControl){

        Optional<Alumno> alumno = this.repoAlumnos.findById(numeroControl);
        if (alumno.isPresent()) {
            return ResponseEntity.ok(alumno.get());
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
}
