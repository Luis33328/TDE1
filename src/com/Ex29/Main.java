package com.Ex29;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double porH = 10.50;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de horas que o porteiro trabalhará: ");
		int horas = sc.nextInt();
		
		double salario = porH * horas;
		
		if(salario < 50) {
			System.out.println("Quantia recebida pelo porteiro: " + (salario));
			System.out.println("Por favor, dirija-se à direção do hotel.");
		}
		else {
			System.out.println("Quantia recebida pelo porteiro: " + (salario));
		}
	}
	
}
