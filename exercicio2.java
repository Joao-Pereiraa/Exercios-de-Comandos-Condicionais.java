package atividades;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		
		int number1 ;
		int number2 ;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero: ");
		number1 = leitor.nextInt();
		
		System.out.println("digite o segundo numero: ");
		number2 = leitor.nextInt();
		

		if (number1 + number2 > 10){
			System.out.println( number1 + number2);
			
		}
			
		else {
			System.out.println(" sua soma é menor que 10");
			
		}	
		
		
	}
}
