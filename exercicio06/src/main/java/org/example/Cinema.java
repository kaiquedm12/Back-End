package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
     List<Filme> listaFilmes = new ArrayList<>();
     List<Ingresso> ingressoVendido = new ArrayList<>();

    public void adicionarFilme(Filme filme) {
        listaFilmes.add(filme);
    }

    public Filme buscarFilmePorNome(String nome) {
        for (Filme filme : listaFilmes) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                return filme;
            }
        }
        return null; // Retorna null se o filme não for encontrado
    }

    public boolean assentoDisponivel(String assento) {
        for (Ingresso ingresso : ingressoVendido) {
            if (ingresso.getAssento().equalsIgnoreCase(assento)) {
                return false; // Assento já ocupado
            }
        }
        return true;
    }

    public void venderIngresso(Ingresso ingresso) {
        ingressoVendido.add(ingresso);
    }
}
