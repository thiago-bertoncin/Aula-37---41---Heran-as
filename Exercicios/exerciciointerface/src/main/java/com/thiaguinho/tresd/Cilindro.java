package com.thiaguinho.tresd;

import com.thiaguinho.Figura3D;

public class Cilindro extends Figura3D {
    
    private int raio;
    private int altura;
    
    public Cilindro(String nome, int raio, int altura) {
        this.raio = raio;
        this.altura = altura;
        this.setNome(nome);
    }
    public int getRaio() {
        return raio;
    }
    public void setRaio(int raio) {
        this.raio = raio;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    @Override
    public double calcularVolume() {
        return Math.pow(raio, 2) * Math.PI * altura;
    }
    @Override
    public double calcularArea() {
        return 2 * Math.PI * raio * (raio + altura);
    }
    
}
