package com.thiaguinho;


public class ContaBancaria {

        private String nomeCliente;
        private String numConta;
        private double saldo;

        public String getNomeCliente() {
            return nomeCliente;
        }
        public void setNomeCliente(String nomeCliente) {
            this.nomeCliente = nomeCliente;
        }
        public String getNumConta() {
            return numConta;
        }
        public void setNumConta(String numConta) {
            this.numConta = numConta;
        }
        public double getSaldo() {
            return saldo;
        }
        public void setSaldo(int saldo) {
            this.saldo = saldo;
        }

        public double sacar(double valorSacar) {
            if (saldo >= valorSacar) {
                saldo -= valorSacar;
                return saldo;
            }
            System.out.println("Não foi possível realizar o saque");
            return saldo;
        }

        public double depositar(double valorDepositar) {
            saldo += valorDepositar;
            return saldo;
        }


        
}
