package com.thiaguinho;

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

    
}
