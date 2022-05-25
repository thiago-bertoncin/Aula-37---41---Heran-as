package com.thiaguinho;

import com.thiaguinho.doisd.Circulo;
import com.thiaguinho.doisd.Quadrado;
import com.thiaguinho.doisd.Triangulo;
import com.thiaguinho.tresd.Cilindro;
import com.thiaguinho.tresd.Cubo;
import com.thiaguinho.tresd.Piramide;

import javafx.scene.shape.TriangleMesh;

public class Teste {
    
    public static void main(String[] args) {
        
        Quadrado f1 = new Quadrado("Quadrado", 5);
        Circulo f2 =  new Circulo("Círculo", 2);
        Triangulo f3 =  new Triangulo("Triângulo", 3, 2);
        Cubo f4 = new Cubo("Cubo", 3);
        Cilindro f5 = new Cilindro("Cilíndro", 2, 3);
        Piramide f6 = new Piramide("Pirâmide", 3, 2, 4, 4, f1);

        FiguraGeometrica[] figuras = {f1, f2, f3, f4, f5, f6};

        for (FiguraGeometrica figura : figuras) {
            System.out.println("Nome: " + figura.getNome());
        }

    }
}