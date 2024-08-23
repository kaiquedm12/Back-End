package org.example;

public class Personagem {
    public String nome;
    public Integer vida;
    public Integer ataque;


    public  void receberDano(int dano){
        vida -= dano;
        if (vida <= 0) {
            vida = 0;
            System.out.println(nome + " foi derrotado!");
        }

    }
    public void atacar(Personagem alvo) {
           if (alvo.vida > 0){
               alvo.receberDano(ataque);
               if (alvo.vida == 0){
                   System.out.println("Ataque de " + nome + " contra " + alvo.nome + " foi bem-sucedido!");
               }
           } else{
               System.out.println("Ataque de " + nome + " falhou, pois " + alvo.nome + " já está derrotado.");
           }
    }

    public boolean personagemVivo(){
        return vida > 0;
    }
}