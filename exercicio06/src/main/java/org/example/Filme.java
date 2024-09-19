package org.example;

public class Filme {
     String nome;
     double preco;
     int idadeMinima;

    public Filme(String nome, double preco, int idadeMinima) {
        this.nome = nome;
        this.preco = preco;
        this.idadeMinima = idadeMinima;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }
}

