package com.thiaguinho.doisd;

import com.thiaguinho.Figura2D;

public class Quadrado extends Figura2D {
    
    private double lado;

    public Quadrado(String nome, double lado) {
        this.lado = lado;
        this.setNome(nome);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }
    
}
