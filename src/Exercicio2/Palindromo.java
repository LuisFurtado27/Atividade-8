package Exercicio2;

import java.text.Normalizer;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira uma palavra ou frase
        System.out.print("Digite uma palavra ou frase: ");
        String entrada = scanner.nextLine();

        // Remove espaços, caracteres especiais, acentos e converte para letras minúsculas
        String textoFormatado = formatarTexto(entrada);

        // Verifica se é um palíndromo
        boolean ehPalindromo = verificarPalindromo(textoFormatado);

        // Exibe o resultado
        if (ehPalindromo) {
            System.out.println("A frase/palavra \"" + entrada + "\" é um palíndromo!");
        } else {
            System.out.println("A frase/palavra \"" + entrada + "\" não é um palíndromo.");
        }

        scanner.close();
    }

    // Método que verifica se a palavra ou frase é um palíndromo
    public static boolean verificarPalindromo(String texto) {
        int inicio = 0;
        int fim = texto.length() - 1;

        while (inicio < fim) {
            if (texto.charAt(inicio) != texto.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }

        return true;
    }

    // Método para formatar o texto (remover espaços, acentos e caracteres especiais)
    public static String formatarTexto(String texto) {
        // Remove acentos
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("[^\\p{ASCII}]", ""); // Remove caracteres não ASCII

        // Remove espaços e caracteres não alfanuméricos
        texto = texto.replaceAll("[^a-zA-Z0-9]", ""); // Remove tudo que não for letra ou número

        // Converte para letras minúsculas
        return texto.toLowerCase();
    }
}
