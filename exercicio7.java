package atividades;

import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {
		
	
		String nome;
		int number1;
		String nome2;
		int number2;
		
		Scanner leitor = new Scanner (System.in);
		
		
		System.out.println("digite seu nome: ");
		nome = leitor.next();
		
		System.out.println("digite sua idade: ");
		number1 = leitor.nextInt();
		

		System.out.println("digite seu nome: ");
		nome2 = leitor.next();

		System.out.println("digite sua idade: ");
		number2 = leitor.nextInt();
		
		if(number1 > number2){
			System.out.println(nome +" tem " + number1 +", você é o mais velho" );
				
		}
		else {
			System.out.println(nome2 +" tem " + number2 +", você é o mais velho");
			
			
			
		}
		
				
	}

}
