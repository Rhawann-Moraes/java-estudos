package megasena;

import java.util.InputMismatchException;
import java.util.Scanner;

public class megaSena
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int[]numerosEscolhidos = obterNumeros("Insira os números: ", scanner);
		
		System.out.println("Números escolhidos");
		for (int i = 0; i < numerosEscolhidos.length; i++) 
		{
			if(i == 0)
			{
				System.out.print( "(" + numerosEscolhidos[i] + " - ");
			}
			else if(i == numerosEscolhidos.length -1)
			{
				System.out.println(numerosEscolhidos[i] + ")");
			}
			else
			{
				System.out.print(numerosEscolhidos[i] + " - ");
			}  
		}
		scanner.close();
	}
	
	public static int[] obterNumeros(String mensagem, Scanner scanner)
	{
		int posicao = 0;
		int tamanho = 7;
		int numerosEscolhidos[] = new int [tamanho];
		while (posicao < tamanho) {
            try {
                System.out.println("Digite o " + (posicao + 1) + "º número: ");
                int numero = scanner.nextInt();

                if (numero > 100 || numero <= 0)
                {
                    System.err.println("Erro: Número não pode ser maior que 100 e nem menor ou igual a 0. Tente novamente.");
                }
                else if(numerosIguais(numerosEscolhidos, numero))
                {
                	System.err.println("Esse número já foi selecionado. Escolha outro número");
                }
                else 
                {
                    numerosEscolhidos[posicao] = numero;
                    posicao++;
                }
            } catch (InputMismatchException e) {
                System.err.println("Erro: Tipo de dado inválido. Insira um número válido.");
                scanner.nextLine();
            }
        }

        return numerosEscolhidos;
    } 
	
	public static boolean numerosIguais(int[] array, int numero)
	{
		for (int i = 0; i < array.length; i++)
		{
			if(array[i] == numero)
			{
				return true;
			}
		}
		return false;
	}
}
