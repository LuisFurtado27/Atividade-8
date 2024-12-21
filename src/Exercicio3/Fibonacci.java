package Exercicio3;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o valor de n
        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        // Valida a entrada
        if (n <= 0) {
            System.out.println("Por favor, insira um número maior que zero.");
        } else {
            System.out.println("Os primeiros " + n + " números da sequência de Fibonacci são:");
            calcularFibonacci(n);
        }

        scanner.close();
    }

    // Calcula e exibi os números da sequência de Fibonacci
    public static void calcularFibonacci(int n) {
        int primeiro = 0;
        int segundo = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(primeiro + " ");
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
        System.out.println();
    }
}

