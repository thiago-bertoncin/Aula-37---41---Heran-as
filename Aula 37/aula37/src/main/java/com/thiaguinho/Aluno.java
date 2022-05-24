package com.thiaguinho;

import java.util.Arrays;

public class Aluno extends DadosPessoa {
    
    private String curso;
    private double[] notas;

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    @Override
    public String obterEtiquetaEndereco() {
        String s = "Endereço do Aluno: ";
        s += super.getEndereco();
        
        return s
        ;
    }
    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }
    @Override
    public String toString() {
        return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
    }

    
    
}
