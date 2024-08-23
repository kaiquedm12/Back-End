package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Personagem jogador = new Personagem();
        jogador.nome = "kaique";
        jogador.vida = 10;

        Personagem inimigo = new Personagem();
        inimigo.nome = "Lula";
        inimigo.vida = 20;

        Personagem piloto = new Kamikaze();
        piloto.nome = "Piloto Japones";
        piloto.vida = 10;

        jogador.atacar(inimigo);
        piloto.atacar(inimigo);

        System.out.println("Jogador: " + jogador.vida);
        System.out.println("Lula: " + inimigo.vida);
        System.out.println("Piloto: " + piloto.vida);


    }

}