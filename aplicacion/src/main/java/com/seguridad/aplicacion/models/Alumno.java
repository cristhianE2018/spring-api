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

    @Basic
    @Column
    private String correo;

    @Basic
    @Column
    private String direccion;
    public Alumno(){}

    public String getNumero_control() {
        return numero_control;
    }

    public void setNumero_control(String numero_control) {
        this.numero_control = numero_control;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

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
