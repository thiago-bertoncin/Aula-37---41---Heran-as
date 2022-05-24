package com.thiaguinho;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
    
    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        String rendimento = "Dia de rendimento: " + diaRendimento + "\n";
        return super.toString() + rendimento;
    } 

    public boolean calcularNovoSaldo(double taxaRendimento) {
        Calendar hoje =  Calendar.getInstance();
            if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
                this.setSaldo(this.getSaldo() + this.getSaldo() * taxaRendimento);
                return true;
            } return false;
            
            }

  
    }