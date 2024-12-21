package Exercicio1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Solicita o operador
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        // Variável para armazenar o resultado
        double resultado = 0;
        boolean operacaoValida = true;

        // Realiza a operação com base no operador
        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Erro: Operador inválido.");
                operacaoValida = false;
        }

        // Exibe o resultado se a operação for válida
        if (operacaoValida) {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}

