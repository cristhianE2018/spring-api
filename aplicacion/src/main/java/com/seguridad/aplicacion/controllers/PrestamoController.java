package com.seguridad.aplicacion.controllers;


import com.seguridad.aplicacion.models.Prestamo;
import com.seguridad.aplicacion.models.PrestamosByEstudiante;
import com.seguridad.aplicacion.repositories.RepositorioPrestamo;
import com.seguridad.aplicacion.repositories.RepositorioPrestamos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class PrestamoController {


    //Inyección de dependencias
    RepositorioPrestamos repositorioPrestamos;

    RepositorioPrestamo repoPrestamo;
    public PrestamoController(RepositorioPrestamos repositorioPrestamos, RepositorioPrestamo repoPrestamo){
        this.repositorioPrestamos = repositorioPrestamos;
        this.repoPrestamo = repoPrestamo;
    }



    /*
        Agregar un prestamo, se requiere
         - Número de control del alumno
         - Código del libro
         - Fecha de prestamo
         - Fecha de regreso
     */

    @PostMapping("prestamos")
    public ResponseEntity<Prestamo> agregarPrestamo(@RequestBody Prestamo prestamo){
        System.out.println("prestamo() ");
        try {
            this.repositorioPrestamos.save(prestamo);
            return ResponseEntity
                    .created(new URI("prestamo/" + prestamo.getEstudiante()))
                    .body(prestamo);
        }
        catch (Exception ex) {
            return ResponseEntity.status(400)
                    .header("ERROR", ex.getMessage())
                    .build();
        }
    }
    @GetMapping("prestamos/{numeroControl}")
    public List<PrestamosByEstudiante> getPrestamosEstudiante(@PathVariable("numeroControl") String numeroControl){
        return repoPrestamo.getPrestamosByEstudiante(numeroControl);
    }
}
