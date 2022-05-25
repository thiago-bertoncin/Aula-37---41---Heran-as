package com.thiaguinho;

public class PessoaFisica extends Contribuinte {
    
    private String cpf;

    

    public PessoaFisica(String nome, double rendaBruta, String cpf) {
        this.setNome(nome);
        this.setRendaBruta(rendaBruta);
        this.setCpf(cpf);;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public double calcularImposto() {
        double renda = this.getRendaBruta()
;
        if(renda <= 1400) {
            return 0;
        } else if (renda > 1400 && renda <=2100) {
            return renda * 0.1 - 100;
        } else if (renda > 2100 && renda <=2800) {
            return renda * 0.15 - 270;
        } else if (renda > 2800 && renda <=3600) {
            return renda * 0.25 - 500;
        } 
        return renda * 0.3 - 700;
    }

    @Override
    public String toString() {
        String s = "***Pessoa Física***" + "\n";
        s += super.toString();
        s += "CPF: " + cpf + "\n";
        s += "Imposto de renda: " + calcularImposto() + "\n";

        return s;
    }

    
    
}
