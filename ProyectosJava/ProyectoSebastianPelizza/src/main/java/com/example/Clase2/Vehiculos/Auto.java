package com.example.Clase2.Vehiculos;

public class Auto extends Vehiculos {
    
    private String marca;
    private String patente;
    private String modelo;

    public Auto(int cantRuedas) {
        super(cantRuedas);
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return this.patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "{" +
            " marca='" + getMarca() + "'" +
            ", patente='" + getPatente() + "'" +
            ", modelo='" + getModelo() + "'" +
            "}";
    }

}

    