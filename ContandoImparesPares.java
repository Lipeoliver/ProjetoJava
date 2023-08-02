package Projeto;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quantNumeros;
		int numero;
		int quantPares = 0,quantImpares = 0;
		
		System.out.println("Quantos numeros: ");
		quantNumeros = scan.nextInt();
		
		int count = 0;
		do { 
			System.out.println("Numero: ");
			numero = scan.nextInt();
			
			if (numero % 2 == 0)quantPares++;
			else quantImpares++;
			
			count = count + 1;
		}while(count < quantNumeros);
		
		System.out.println("Quantidade PAR: " + quantPares );
		System.out.println("Quantidade Impares: " + quantImpares );
	}

}
