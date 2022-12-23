package com.example.Clase2.Personas;

import java.math.BigDecimal;

public class Profesor extends Persona{
    private BigDecimal sueldo;


    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public BigDecimal getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }


    @Override
    public String toString() {
        return "{" +
        " Nombre='" + super.getNombre() + "'" +
        " Apellido='" +  super.getApellido() + "'" +
        " sueldo='" + getSueldo() + "'" +
        "}";
    }


}
