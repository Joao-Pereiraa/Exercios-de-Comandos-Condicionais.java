package atividades;

import java.util.Scanner;

public class exercicio5 {
	
public static void main(String[] args) {
	
    int number1; 
	
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("digite um numero: ");
	number1 = leitor.nextInt();
	
	if(number1 % 2 == 0){
		System.out.println(number1 + " é par");
		
	}
	
	else{ 
		System.out.println( number1 + " é impar");
	}
	
		
	
}
}
