package com.example.Clase2.Personas;

public class Estudiante extends Persona{
    private int notas;

    public Estudiante(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public int getNotas() {
        return this.notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

}
