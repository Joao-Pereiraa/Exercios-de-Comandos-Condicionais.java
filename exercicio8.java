package atividades;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {

		String senha;
		
		
		
	
	
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("digite a senha: ");
		senha = leitor.next();
		
		if(senha.equals("AEDB")){
			System.out.println(" Acesso Permitido");
		}
		
		else{System.out.println("Acesso Negado");
			
		
		}
	
		
		
	}
}
