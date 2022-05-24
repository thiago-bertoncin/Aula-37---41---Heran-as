package com.thiaguinho;

public class ContaEspecial  extends ContaBancaria {
    
    private double limiteEspecial;

    public double getLimite() {
        return limiteEspecial;
    }

    public void setLimite(double limite) {
        this.limiteEspecial = limite;
    }

    @Override
    public String toString() {
        String limite = "Limite especial: " + limiteEspecial + "\n";
        return super.toString() + limite;
    }

    public double sacar(double valorSaque) {
        double saldoComLimite = this.getSaldo() + limiteEspecial;

        if (saldoComLimite - valorSaque > 0) {
            this.setSaldo(this.getSaldo()-limiteEspecial);
            limiteEspecial -= valorSaque;
            return this.getSaldo();
        } 
        System.out.println("Não foi possível realizar o saque.");
        return this.getSaldo();
    }
    
}
