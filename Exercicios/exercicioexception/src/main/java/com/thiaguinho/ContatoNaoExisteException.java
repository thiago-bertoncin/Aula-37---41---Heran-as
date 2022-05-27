package com.thiaguinho;

public class ContatoNaoExisteException extends Exception {

    private String nomeContato;

    public ContatoNaoExisteException(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    @Override
    public String toString() {
        return "Contato " + nomeContato + " não existe na agenda";
    }


    
}
