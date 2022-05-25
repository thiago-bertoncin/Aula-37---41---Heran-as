package com.thiaguinho.doisd;

import com.thiaguinho.Figura2D;

public class Triangulo extends Figura2D {
    
    private double base;
    private double altura;

    public Triangulo(String nome, double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.setNome(nome);
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return (base * altura )/2;
    }
    
}
