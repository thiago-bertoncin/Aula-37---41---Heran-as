package com.thiaguinho;


public class Test {
    
    public static void main(String[] args) {

        DadosPessoa aluno = new Aluno();
        aluno.setNome("Thiago");
        aluno.setEndereco("Rua roxo moreira, 1111");

        DadosPessoa professor = new Professor();
        professor.setEndereco("Rua Shigeo Mori, 2222");

        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();
        
    }
}
