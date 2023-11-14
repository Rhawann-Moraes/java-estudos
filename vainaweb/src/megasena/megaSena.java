package megasena;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class megaSena
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int [] numerosEscolhidos = obterNumeros("Insira os números: ", scanner);
		
		int [] numerosSorteados = sorteio();
		
		exibir("Esses são os seus números escolhidos: ", numerosEscolhidos);
		exibir("Esses são os seus números sorteados: ", numerosSorteados);
		
		
		
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
	
	public static int [] sorteio()
	{
		int tamanho = 7;
		int numerosSorteados[]= new int[tamanho];
		Random random = new Random();
		
		for (int i = 0; i < tamanho; i++) {
            int numeroSorteado;
            do {
                numeroSorteado = random.nextInt(100) + 1;
            } while (numerosIguais(numerosSorteados, numeroSorteado));

            numerosSorteados[i] = numeroSorteado;
        }

        return numerosSorteados;
    }

	public static void exibir(String mensagem, int [] numeros)
	{
		System.out.println(mensagem);
		for (int i = 0; i < numeros.length; i++) 
		{
			if(i == 0)
			{
				System.out.print( "(" + numeros[i] + " - ");
			}
			else if(i == numeros.length -1)
			{
				System.out.println(numeros[i] + ")");
			}
			else
			{
				System.out.print(numeros[i] + " - ");
			}  
		}
	}
}
