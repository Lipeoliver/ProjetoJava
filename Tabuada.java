package Projeto;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		System.out.println("--------------------------------------------");
		System.out.println("                   TABUADA                  ");
		System.out.println("--------------------------------------------");
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int soma;
		
		 
		System.out.println("Qual Tabuada deseja ver?");
        numero = scan.nextInt();
      
         
        int count = 0;   
         
        do { 
       
        	soma = numero * count;
        	System.out.println("a multiplicacao de " + numero + " X " + count + " = " + soma);
        	
        	count = count + 1;
        }while(count <= 10);
        
        
	}

}
