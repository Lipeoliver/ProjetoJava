package Projeto;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		
		System.out.println("-----------------------------");
		System.out.println("CONTE ATE O NUMERO QUE QUISER");
		System.out.println("-----------------------------");
		
		System.out.println("Deseja contar ate que numero");
		numero = scan.nextInt();
		System.out.println("Contando  ");
		
		for(int count = 0; count<= numero ;count++ ) {
			
			System.out.println( count);
			
			
		}
		System.out.println("------------------------------");

	}

}
