package com.thiaguinho;

public class PessoaJuridica extends Contribuinte {
    
    private String cnpj;

    

    public PessoaJuridica(String nome, double rendaBruta, String cnpj) {
        this.setNome(nome);
        this.setRendaBruta(rendaBruta);
        this.setCnpj(cnpj);;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        double imposto = this.getRendaBruta() * 0.1;
        return imposto;
    }

    @Override
    public String toString() {
        String s = "***Pessoa Jurídica***" + "\n";
        s += super.toString();
        s += "CNPJ: " + cnpj + "\n";
        s += "imposto de renda: " + calcularImposto() + "\n";

        return s;
    }

    

    
}
