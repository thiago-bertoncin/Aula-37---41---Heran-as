package com.thiaguinho.doisd;

import com.thiaguinho.Figura2D;

public class Circulo extends Figura2D {
    
    private int raio;
    

    public Circulo(String nome ,int raio) {
        this.raio = raio;
        this.setNome(nome);
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.pow(raio, 2) * Math.PI;
    }

}
