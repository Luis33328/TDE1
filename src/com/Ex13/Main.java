package com.Ex13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		
		System.out.println("Digite a quantia que deseja sacar: ");
		double dinheiro = scan.nextDouble();
		
		System.out.println("Seu nome: " + nome);
		System.out.println("Sua idade: " + idade);
		System.out.println("Seu saque: " + dinheiro);
	}
	
}
