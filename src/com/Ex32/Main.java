package com.Ex32;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um comando para conversão ('KG' ou 'L') :");
		
		String conv = sc.nextLine();
		
		String arr[] = conv.split(" ");
		
		int num = Integer.parseInt(arr[1]);
		
		if(arr[0].toUpperCase().contains("KG")) {
			System.out.println("Conversão para libras: " + (num * 0.454));
		}
		else if(arr[0].toUpperCase().contains("L")) {
			System.out.println("Conversão para quilogramas: " + (num / 0.454));
		}
		
	}
	
}
