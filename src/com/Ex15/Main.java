package com.Ex15;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite alguma coisa: ");
		String str = sc.nextLine() + " - Exemplo String";
		int count = 0;
		
		System.out.println(str);
		
		for(int i = 0; i<str.length(); i++) {
			count++;
		}
		
		System.out.println("Número de caracteres da string: " + count);
		
		String arr[] = str.split(" ");
		System.out.println(arr[0] + " é uma nova String!");
	}
}
