package com.Ex33;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base menor: ");
		int b = sc.nextInt();
		
		System.out.println("Digite a base maior: ");
		int B = sc.nextInt();
		
		System.out.println("Digite a altura: ");
		int h = sc.nextInt();
		
		int area = ((b+B) * h) / 2;
		
		System.out.println("Área: " + area);
		
	}
	
}
