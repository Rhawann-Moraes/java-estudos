package vainaweb;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número");
        double num1 = entrada.nextDouble();

        System.out.println("Informe a operação");
        String operacao = entrada.next();

        System.out.println("Informe um número");
        double num2 = entrada.nextDouble();

        double resultado = 0.0;

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
        entrada.close();
    }
}
