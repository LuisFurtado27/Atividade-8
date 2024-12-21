package Exercicio7;

import java.util.Scanner;

public class ContadorDePalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira uma frase
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Conta o número de palavras na frase
        int numeroDePalavras = contarPalavras(frase);

        // Exibe o resultado
        System.out.println("A frase contém " + numeroDePalavras + " palavra(s).");

        scanner.close();
    }

    // Método para contar palavras em uma frase
    public static int contarPalavras(String frase) {
        if (frase == null || frase.trim().isEmpty()) {
            return 0; // Retorna 0 se a frase for nula ou vazia
        }

        // Divide a frase em palavras usando espaços em branco como delimitadores
        String[] palavras = frase.trim().split("\\s+");
        return palavras.length;
    }
}

