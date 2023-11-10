package vainaweb;

import java.util.Scanner;

public class metodosEstudo 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		do
		{
			System.out.println("Insira o primeiro número: ");

			double numero1 = scanner.nextDouble();

			System.out.println("Insira o segundo número: ");
			double numero2 = scanner.nextDouble();

			System.out.println("Escolha a operação ( +, -, *, /): ");
			char operacao = scanner.next().charAt(0);

			double resultado = 0;

			switch (operacao) 
			{
				case '+':
					resultado = somar(numero1, numero2);
					break;
					
				case '-':
					resultado = subtrair(numero1, numero2);
					break;
					
				case '*':
					resultado = multiplicar(numero1, numero2);
					break;
					
				case '/':
					resultado = dividir(numero1, numero2);
					break;
				default:
					System.out.println("Operação inválida. Escolha a operação novamente.");
					continue;
			}
			System.out.println("Resultado: " + resultado);
		}
		while(continuarOperacao(scanner));
		System.out.println("FIM DE OPERAÇÃO!");
	}
	public static double somar(double num1, double num2)
	{
		return num1 + num2;
	}
	public static double subtrair(double num1, double num2)
	{
		return num1 - num2;
	}
	public static double multiplicar(double num1, double num2)
	{
		return num1 * num2;
	}
	public static double dividir(double num1, double num2)
	{
		return num1 / num2;
	}
	public static boolean continuarOperacao(Scanner scanner)
	{
			System.out.println("Deseja fazer outra operação? (Digite 's' para sim, 'n' para não): ");
			char resposta = scanner.next().charAt(0);
			return resposta == 's' || resposta == 'S';
	}
}