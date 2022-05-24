package com.thiaguinho;

import org.junit.Test;

public class ContaBancariaTest {

    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria();
        conta.setSaldo(500);

        conta.sacar(200);
        System.out.println(conta.getSaldo());

        conta.depositar(34.6);
        System.out.println(conta.getSaldo());


    }
    

    
    @Test
    public void testDepositar() {

    }

    @Test
    public void testSacar() {

    }
}
