package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        RepositorioMusica emule = new RepositorioMusica();

        emule.adicionarMusica("Fear of the dark", "Iron Maiden" );
        emule.adicionarMusica("Numb", "Linkin Park");
        emule.adicionarMusica("Cogumelo", "Ventania");
        emule.adicionarMusica("Voando pro Para", "Joelma");
        emule.adicionarMusica("Fundo da grota", "Baitaca");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o nome da musica: ");
            String termo = scanner.nextLine();

            try {
                Musica musicaPesquisada = emule.buscarMusica(termo);
                System.out.println(musicaPesquisada.getTitulo() + " " + musicaPesquisada.getArtista());
            } catch (RuntimeException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}