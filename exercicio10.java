package atividades;

import java.util.Scanner;

public class exercicio10 {
	
	public static void main(String[] args) {
		
		String sexo;
		float number1;
		
	Scanner leitor = new Scanner (System.in);
		
		
		System.out.println("digite seu sexo: ");
		sexo= leitor.next();
		
		System.out.println ("digite sua altura em centímetro: ");
		number1 = leitor.nextFloat();
		
		if(sexo.equals("masculino") ) {
			
			System.out.println("peso ideal: " + (((number1*(72.7/100))-58)));
									
		}
		
		else{
			System.out.println("peso ideal: " + (((number1*(62.1/100))-44.7)) );
		}
			
		
		
	}

}
