package com.thiaguinho.tresd;

import com.thiaguinho.Figura2D;
import com.thiaguinho.Figura3D;

public class Piramide extends Figura3D {
    
    private double altura;
    private int arestaBase;
    private int apotema;

    private Figura2D base;

    public double getAltura() {
        return altura;
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

    
}
