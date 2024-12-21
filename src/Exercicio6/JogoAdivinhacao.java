package Exercicio6;

import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Gera um número aleatório entre 1 e 50
        int numeroEscolhido = random.nextInt(50) + 1;

        System.out.println("Bem-vindo(a) ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número que estou pensando (entre 1 e 50).");

        int palpite = 0;

        // Loop para continuar o jogo até o número ser adivinhado
        while (palpite != numeroEscolhido) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite == numeroEscolhido) {
                System.out.println("Parabéns! Você acertou o número " + numeroEscolhido + "!");
            } else {
                System.out.println("Errado! Tente novamente.");
            }
        }

        scanner.close();
    }
}
