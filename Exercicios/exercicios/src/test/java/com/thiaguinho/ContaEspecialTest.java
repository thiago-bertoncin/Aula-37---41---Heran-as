package com.thiaguinho;

public class ContaEspecialTest {

    public static void main(String[] args) {
        
        ContaEspecial contaDeTeste = new ContaEspecial();
        contaDeTeste.setSaldo(500);
        contaDeTeste.setNumConta("11-111");
        contaDeTeste.setNomeCliente("Thiaguinho Poupança");
        contaDeTeste.setLimite(1000);

        System.out.println(contaDeTeste);

        contaDeTeste.sacar(800);

        System.out.println(contaDeTeste);
    }
}
