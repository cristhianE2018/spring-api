package com.seguridad.aplicacion.controllers;

import com.seguridad.aplicacion.models.Libro;
import com.seguridad.aplicacion.repositories.RepositorioLibros;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class LibroController {


    RepositorioLibros repositorioLibros;

    public LibroController(RepositorioLibros repositorioLibros){
        this.repositorioLibros = repositorioLibros;
    }

    @GetMapping("libros")
    public List<Libro> getLibros(){
        return this.repositorioLibros.findAll();
    }
}
