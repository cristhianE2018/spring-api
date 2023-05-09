package com.seguridad.aplicacion.models;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    private int id;
    @Basic
    private String nombre;
    @Basic
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Basic
    private String email;
    public Usuario(){}

    public Usuario(int id,String nombre, String email, String password){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String correo) {
        this.email = correo;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

}
