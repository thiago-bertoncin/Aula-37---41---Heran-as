package com.thiaguinho;

public class ContaPoupancaTest {

    public static void main(String[] args) {
        ContaPoupanca contaDeTeste = new ContaPoupanca();
        contaDeTeste.setSaldo(500);
        contaDeTeste.setNumConta("11-111");
        contaDeTeste.setNomeCliente("Thiaguinho Poupança");
        contaDeTeste.setDiaRendimento(24);
        

        System.out.println("**** Conta Poupança ****");
        System.out.println(contaDeTeste);

        if (contaDeTeste.calcularNovoSaldo(0.5)) {
            System.out.println("Novo saldo com redimento: " + contaDeTeste.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento");
        }

    }


}
