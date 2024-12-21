package Exercicio4;

import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Calcula o número invertido
        int numeroInvertido = inverterNumero(numero);

        // Exibe o número invertido
        System.out.println("O número invertido é: " + numeroInvertido);

        scanner.close();
    }

    // Método para inverter o número
    public static int inverterNumero(int numero) {
        int invertido = 0;

        while (numero != 0) {
            int digito = numero % 10;      // Pega o último dígito
            invertido = invertido * 10 + digito; // Adiciona o dígito ao número invertido
            numero /= 10;                 // Remove o último dígito do número original
        }

        return invertido;
    }
}

