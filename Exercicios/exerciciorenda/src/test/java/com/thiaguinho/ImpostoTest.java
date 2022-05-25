package com.thiaguinho;

public class ImpostoTest {
    public static void main(String[] args) {
        
        PessoaFisica rafael = new PessoaFisica("Rafael", 500, "111.111.111-11");
        PessoaFisica thiago = new PessoaFisica("Thiago", 10000, "222.222.222-22");
        PessoaFisica fabricio = new PessoaFisica("Fabricio", 20000, "333.333.333-33");

        PessoaJuridica ambev = new PessoaJuridica("Ambev", 1000000, "66.553.387/0001-11");
        PessoaJuridica globalTech = new PessoaJuridica("Global Tech", 2000000, "31.562.165/0001-80");
        PessoaJuridica bees = new PessoaJuridica("BEES", 500000, "80.137.255/0001-30");

        PessoaFisica[] pessoas = {rafael, thiago, fabricio};
        PessoaJuridica[] empresas = {ambev, globalTech, bees};

        for (PessoaFisica pessoa : pessoas) {
            pessoa.calcularImposto();
            System.out.println(pessoa);
        }

        for (PessoaJuridica empresa : empresas) {
            empresa.calcularImposto();
            System.out.println(empresa);
        }
        







    }


   
}
