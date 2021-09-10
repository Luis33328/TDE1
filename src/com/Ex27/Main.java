package com.Ex27;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		boolean check = false;
		
		for (int i = 2; i <= num / 2; ++i) {

			if (num % i == 0) {
		        check = true;
		        break;
		    }
		}
		
		if(num % 2 == 0) {
			System.out.print(num + ": Par");
		}
		else {
			System.out.print(num + ":Ímpar");
		}
		
		if (!check) {
		      System.out.println(" e primo.");
		}
		else {
		      System.out.println( " e não primo.");
		}
		
	}
}
