package com.seguridad.aplicacion.models;

import jakarta.persistence.*;

@Entity
@Table(name="alumnos")
public class Alumno {

    @Id
    @Column(name="numero_control")
    private String numero_control;

    @Basic
    @Column(name = "nombre")
    private String nombre;

    public Alumno(){}

    public Alumno(String numeroControl, String nombre){
        this.numero_control = numeroControl;
        this.nombre = nombre;
    }

    public String getNumeroControl() {
        return numero_control;
    }

    public void setNumeroControl(String numeroControl) {
        this.numero_control = numeroControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
