package org.example;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.adicionarFilme(new Filme("Homem Aranha", 20.0, 12));
        cinema.adicionarFilme(new Filme("Gente Grande", 25.0, 14));
        cinema.adicionarFilme(new Filme("Panico IV", 18.0, 18));
        cinema.adicionarFilme(new Filme("Lagoa Azul", 15.0, 0));
        cinema.adicionarFilme(new Filme("Interestelar", 22.0, 14));

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Que filme você deseja assistir?");
            String nomeFilme = scanner.nextLine();
            Filme filme = cinema.buscarFilmePorNome(nomeFilme);

            if (filme == null) {
                System.out.println("Filme não encontrado!");
                continue;
            }

            System.out.println("Qual assento você deseja? (Ex: A1 a F5)");
            String assento = scanner.nextLine();

            if (!cinema.assentoDisponivel(assento)) {
                System.out.println("O ingresso não pode ser vendido pois seu assento não está mais disponível!");
                continue;
            }

            System.out.println("Qual o seu nome?");
            String nomeCliente = scanner.nextLine();

            System.out.println("Qual a sua idade?");
            int idadeCliente = scanner.nextInt();
            scanner.nextLine();

            if (idadeCliente < filme.getIdadeMinima()) {
                System.out.println("O ingresso não pode ser vendido pois sua idade não permite!");
                continue;
            }

            Cliente cliente = new Cliente(nomeCliente, idadeCliente);
            Ingresso ingresso = new Ingresso(cliente, filme, assento);

            cinema.venderIngresso(ingresso);
            System.out.println(ingresso);

            System.out.println("\nDeseja comprar outro ingresso? (s/n)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }

        scanner.close();
    }
}
