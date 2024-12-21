package Exercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira as palavras
        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        // Verifica se as palavras são anagramas
        boolean saoAnagramas = verificarAnagrama(palavra1, palavra2);

        // Exibe o resultado
        if (saoAnagramas) {
            System.out.println("As palavras \"" + palavra1 + "\" e \"" + palavra2 + "\" são anagramas!");
        } else {
            System.out.println("As palavras \"" + palavra1 + "\" e \"" + palavra2 + "\" não são anagramas.");
        }

        scanner.close();
    }

    // Método para verificar se duas palavras são anagramas
    public static boolean verificarAnagrama(String palavra1, String palavra2) {
        // Remove espaços, ignora maiúsculas/minúsculas e normaliza as palavras
        palavra1 = palavra1.replaceAll("\\s+", "").toLowerCase();
        palavra2 = palavra2.replaceAll("\\s+", "").toLowerCase();

        // Verifica se os tamanhos das palavras são diferentes
        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        // Converte as palavras em arrays de caracteres e ordena
        char[] letras1 = palavra1.toCharArray();
        char[] letras2 = palavra2.toCharArray();

        Arrays.sort(letras1);
        Arrays.sort(letras2);

        // Compara os arrays ordenados
        return Arrays.equals(letras1, letras2);
    }
}

