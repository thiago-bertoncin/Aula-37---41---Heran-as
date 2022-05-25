package com.thiaguinho.tresd;

import com.thiaguinho.Figura2D;
import com.thiaguinho.Figura3D;

public class Piramide extends Figura3D {
    
    private double altura;
    private int arestaBase;
    private int apotema;
    private int numpoliBase;

    private Figura2D base;

    public Piramide(String nome, double altura, int arestaBase, int apotema, int numpoliBase, Figura2D base) {
        this.altura = altura;
        this.arestaBase = arestaBase;
        this.apotema = apotema;
        this.numpoliBase = numpoliBase;
        this.base = base;
        this.setNome(nome);
    }

    public double getAltura() {
        return altura;
    }

    public int getNumpoliBase() {
        return numpoliBase;
    }

    public void setNumpoliBase(int numpoliBase) {
        this.numpoliBase = numpoliBase;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(int arestaBase) {
        this.arestaBase = arestaBase;
    }

    public int getApotema() {
        return apotema;
    }

    public void setApotema(int apotema) {
        this.apotema = apotema;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }

    @Override
    public double calcularVolume() {
        if (base != null) {
            return base.calcularArea() * altura / 3;
        } 
        return 0;
        
    }

    @Override
    public double calcularArea() {
        return (numpoliBase * arestaBase * apotema / 2) + base.calcularArea();
    }

    
}
