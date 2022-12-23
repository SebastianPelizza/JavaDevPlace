package com.example.Clase3;


public class Cable extends Enchufe{
    private int largo;

    public Cable(int pata, String color,int largo) {
        super(pata, color);
        this.largo = largo;
    }

    public int getLargo() {
        return this.largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

}