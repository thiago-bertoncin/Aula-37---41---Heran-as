package com.thiaguinho;

public class Contato {
    
    private static int contador;

    private String nome;
    private String telefone;
    private String email;
    private int id;

    
    public Contato() {
        contador++;
        setId(contador);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContador() {
        return contador;
    }
    public void setContador(int contador) {
        Contato.contador = contador;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String s = "";
        s += "ID: " + id + "\n";
        s += "Nome: " + nome + "\n";
        s += "Telefone: " + telefone + "\n";
        s += "E-mail: " + email + "\n";
        return s;
    }
    


    
}
