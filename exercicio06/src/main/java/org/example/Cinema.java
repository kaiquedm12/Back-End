package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
     List<Filme> filmesDisponiveis = new ArrayList<>();
     List<Ingresso> ingressosVendidos = new ArrayList<>();

    public void adicionarFilme(Filme filme) {
        filmesDisponiveis.add(filme);
    }

    public Filme buscarFilmePorNome(String nome) {
        for (Filme filme : filmesDisponiveis) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                return filme;
            }
        }
        return null; // Retorna null se o filme não for encontrado
    }

    public boolean assentoDisponivel(String assento) {
        for (Ingresso ingresso : ingressosVendidos) {
            if (ingresso.getAssento().equalsIgnoreCase(assento)) {
                return false; // Assento já ocupado
            }
        }
        return true;
    }

    public void venderIngresso(Ingresso ingresso) {
        ingressosVendidos.add(ingresso);
    }
}
