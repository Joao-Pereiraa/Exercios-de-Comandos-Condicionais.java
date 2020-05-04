package atividades;

import java.util.Scanner;

public class exercicio6 {
	
	public static void main(String[] args) {
		
		int number1; 
		int number2;
		int number3;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite a primeira nota: ");
		number1 = leitor.nextInt();
		
		System.out.println("digite a segunda nota: ");
		number2 = leitor.nextInt();
		
		System.out.println("digite a terceira nota: ");
		number3= leitor.nextInt();
		
		if(number1 + number2 + number3 >= 7){
			System.out.println(number1 + number2 + number3 + ", o aluno está aprovado" );
		}
		else{
			System.out.println("o aluno está reprovado");
			
		}
		
		
		
	}

}
