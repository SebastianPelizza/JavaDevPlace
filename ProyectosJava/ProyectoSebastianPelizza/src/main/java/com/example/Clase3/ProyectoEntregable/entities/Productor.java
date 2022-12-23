package com.example.Clase3.ProyectoEntregable.entities;

import java.sql.Date;

public class Productor extends Usuario {

    private Date ultimaRenovacion;

    public Productor(String nombre, String apellido, int edad, Date fechaInicSistema, Date ultimaRenovacion) {
        super(nombre, apellido, edad, fechaInicSistema);
        this.ultimaRenovacion = ultimaRenovacion;
    }

    public Date getUltimaRenovacion() {
        return this.ultimaRenovacion;
    }

    public void setUltimaRenovacion(Date ultimaRenovacion) {
        this.ultimaRenovacion = ultimaRenovacion;
    }

}
