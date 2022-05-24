package com.thiaguinho;

import org.junit.Test;

public class ContaBancariaTest {

    public static void main(String[] args) {
        
        ContaBancaria contaDeTeste = new ContaBancaria();
        contaDeTeste.setSaldo(500);
        contaDeTeste.setNumConta("11-111");
        contaDeTeste.setNomeCliente("Thiaguinho Simples");

        contaDeTeste.sacar(200);
        System.out.println(contaDeTeste.getSaldo());

        contaDeTeste.depositar(34.6);
        System.out.println(contaDeTeste.getSaldo());

        System.out.println(contaDeTeste);
    }
    

    
    @Test
    public void testDepositar() {

    }

    @Test
    public void testSacar() {

    }
}
