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
        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public double sacar(double valorSacar) {
            if (saldo >= valorSacar) {
                saldo -= valorSacar;
                System.out.println("Saque efetuado com sucesso. Novo saldo: " + saldo);
                return saldo;
            }
            System.out.println("Não foi possível realizar o saque. Saldo insuficiente");
            return saldo;
        }

        public double depositar(double valorDepositar) {
            saldo += valorDepositar;
            return saldo;
        }

        @Override
        public String toString() {
            String nome = "Nome do cliente: " + nomeCliente + "\n";
            String num= "Número da conta: " + numConta + "\n";
            String sal = "Saldo: " + saldo + "\n"; 
            return nome + num + sal;
        }

        

        
}
