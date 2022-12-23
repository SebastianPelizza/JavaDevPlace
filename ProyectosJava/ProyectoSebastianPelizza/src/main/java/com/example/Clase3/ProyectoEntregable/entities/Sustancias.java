package com.example.Clase3.ProyectoEntregable.entities;

import java.math.BigDecimal;

public class Sustancias {
    private String nombre;
    private BigDecimal porcentajePureza;
    private String formulaQuimica;

    public Sustancias(String nombre, BigDecimal porcentajePureza, String formulaQuimica) {
        this.nombre = nombre;
        this.porcentajePureza = porcentajePureza;
        this.formulaQuimica = formulaQuimica;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPorcentajePureza() {
        return this.porcentajePureza;
    }

    public void setPorcentajePureza(BigDecimal porcentajePureza) {
        this.porcentajePureza = porcentajePureza;
    }

    public String getFormulaQuimica() {
        return this.formulaQuimica;
    }

    public void setFormulaQuimica(String formulaQuimica) {
        this.formulaQuimica = formulaQuimica;
    }

}
