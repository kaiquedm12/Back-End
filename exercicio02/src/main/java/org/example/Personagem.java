package org.example;

public class Personagem {
    public String nome;
    public Integer vida;

    public void atacar(Personagem alvo) {
            System.out.println(alvo.nome + " Foi atacado por " + this.nome);
            alvo.vida -= 5;
    }
}