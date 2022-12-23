package com.example.Clase3.ProyectoEntregable.entities;

import java.sql.Date;

public class Usuario {
    private String nombre;
    private String apellido;
    private int edad;
    private Date altaSistema;

    public Usuario(String nombre, String apellido, int edad, Date altaSistema) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altaSistema = altaSistema;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getAltaSistema() {
        return this.altaSistema;
    }

    public void setAltaSistema(Date altaSistema) {
        this.altaSistema = altaSistema;
    }

}
