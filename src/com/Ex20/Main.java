package com.Ex20;

public class Main {

	public static void main(String[] args) {
		
		int num = 30;
		
		float num2 = 2.5f;
		
		if(num < 15 || num > 100) {
			System.out.println("Sim");
		}
		else {
			System.out.println("N�o");
		}
		
		
		if(num2 >= 1.99 && num2 <= 5.99) {
			System.out.println("Sim");
		}
		else {
			System.out.println("N�o");
		}
		
		if(num == num2) {
			System.out.println("Iguais");
		}
		else {
			System.out.println("N�o s�o iguais");
		}
	}
	
}
