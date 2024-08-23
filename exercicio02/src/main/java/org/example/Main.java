package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Personagem orc = new Personagem();
        orc.nome = "Orc";
        orc.vida = 100;
        orc.ataque = 10;

        Personagem goblin = new Personagem();
        goblin.nome = "Goblin";
        goblin.vida = 50;
        goblin.ataque = 5;

        Personagem lobo = new Personagem();
        lobo.nome = "Lobo";
        lobo.vida = 75;
        lobo.ataque = 15;

        Personagem cavaleiro = new Personagem();
        cavaleiro.nome = "Cavaleiro";
        cavaleiro.vida = 200;
        cavaleiro.ataque = 20;

        Personagem dragao = new Personagem();
        dragao.nome = "Dragão";
        dragao.vida = 500;
        dragao.ataque = 50;

        Personagem steve = new Personagem();
        steve.nome = "Steve";
        steve.vida = 100;
        steve.ataque = 20;

        List<Personagem> inimigos = new ArrayList<>();
        inimigos.add(orc);
        inimigos.add(goblin);
        inimigos.add(lobo);
        inimigos.add(cavaleiro);
        inimigos.add(dragao);

        Random random = new Random();

        while (steve.personagemVivo() && inimigos.stream().anyMatch(Personagem::personagemVivo)){

            Personagem inimigo;
            do{
                inimigo = inimigos.get(random.nextInt(inimigos.size()));
            } while (!inimigo.personagemVivo());

            System.out.println("Steve ataca " + inimigo.nome);
            steve.atacar(inimigo);

            for (Personagem adversario : inimigos){
                if (adversario.personagemVivo() && steve.personagemVivo()){
                    System.out.println(adversario.nome + " ataca Steve");
                    adversario.atacar(steve);
                }
            }

        }

        if (!steve.personagemVivo()){
            System.out.println("Steve foi derrotado!");
        } else{
            System.out.println("Todos os inimigos foram derrotados! Steve venceu!");
        }

    }

}