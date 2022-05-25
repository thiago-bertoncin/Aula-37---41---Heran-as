package com.thiaguinho.tresd;

import com.thiaguinho.Figura3D;

public class Cubo extends Figura3D {
        private int lado;

        public Cubo(String nome, int lado) {
            this.lado = lado;
            this.setNome(nome);
        }

        public int getLado() {
            return lado;
        }

        public void setLado(int lado) {
            this.lado = lado;
        }

        @Override
        public double calcularVolume() {
            return Math.pow(lado, 3);
        }

        @Override
        public double calcularArea() {
            return Math.pow(lado, 2) * 6;
        }
        
}
