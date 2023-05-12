package com.seguridad.aplicacion.models;

import jakarta.persistence.*;

@Entity
@Table(name = "libros")
public class Libro {

    @Id
    private String codigo;

    @Basic
    @Column(name = "titulo")
    private String titulo;

    @Basic
    private String autor;

    @Basic
    @Column(name = "publication_year")
    private int publicacion_anio;

    @Basic
    private int stocK;

    public Libro() {}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPublicacion_anio() {
        return publicacion_anio;
    }

    public void setPublicacion_anio(int publicacion_anio) {
        this.publicacion_anio = publicacion_anio;
    }

    public int getStocK() {
        return stocK;
    }

    public void setStocK(int stocK) {
        this.stocK = stocK;
    }
}
