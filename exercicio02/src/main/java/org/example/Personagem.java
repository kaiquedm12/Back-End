package org.example;

public class Personagem {
    public String nome;
    public Integer vida;
    public Integer ataque;


    public  void receberDano(int dano){
        vida -= dano;
    }
    public void atacar(Personagem alvo) {
        if (vida > 0) {  // Verifica se o personagem ainda está vivo
            if (alvo.vida > 0) {
                alvo.receberDano(ataque);
                if (alvo.vida == 0) {
                    System.out.println("Ataque de " + nome + " contra " + alvo.nome + " foi bem-sucedido!");
                }
            } else {
                System.out.println("Ataque de " + nome + " falhou, pois " + alvo.nome + " já está derrotado.");
            }
        } else {
            System.out.println(nome + " está morto e não pode atacar.");
        }
    }

    public boolean personagemVivo(){
        return vida > 0;
    }
}