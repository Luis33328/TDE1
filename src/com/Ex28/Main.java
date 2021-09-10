package com.Ex28;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int quantHom = 0;
		int quantMul = 0;
		String gen;
		int idade;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			System.out.println("Digite seu gênero (masculino/feminino): ");
			gen = sc.nextLine();
			System.out.println("Digite sua idade: ");
			idade = sc.nextInt();
			String pass = sc.nextLine();
			
			if(gen.contains("masculino") && idade > 17) {
				quantHom++;
			}
			else if(gen.contains("feminino") && idade > 17) {
				quantMul++;
			}
			
		}
		System.out.println("Quantidade de homens maiores de idade: " + quantHom);
		System.out.println("Quantidade de mulheres maiores de idade: " + quantMul);
		
	}
	
}
