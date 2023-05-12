package com.seguridad.aplicacion.controllers;


import com.seguridad.aplicacion.models.Prestamo;
import com.seguridad.aplicacion.models.PrestamosByEstudiante;
import com.seguridad.aplicacion.repositories.RepositorioPrestamo;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PrestamoController {

    RepositorioPrestamo repositorioPrestamo;

    public PrestamoController(RepositorioPrestamo repositorioPrestamo){
        this.repositorioPrestamo = repositorioPrestamo;
    }

    @GetMapping("prestamos/{numeroControl}")
    public List<PrestamosByEstudiante> getPrestamosEstudiante(@PathVariable("numeroControl") String numeroControl){
        return repositorioPrestamo.getPrestamosByEstudiante(numeroControl);
    }

    /*
        Agregar un prestamo, se requiere
         - Número de control del alumno
         - Código del libro
         - Fecha de prestamo
         - Fecha de regreso
     */

    /*@PostMapping("prestamos")

    public ResponseEntity<Prestamo> agregarPrestamo(@RequestBody Prestamo prestamo){

        try {


        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

     */
}
