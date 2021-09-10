package com.Ex25;

public class Main {

	public static void main(String[] args) {
		
		int count = 0;
		long produto = 1;
		
		for(int i=0; i<30; i++) {
			if(i %2 != 0) {
				count += i;
			}
			else {
				if(i > 0) {
					produto *= i;
				}
			}
		}
		
		System.out.println("Soma dos ímpares: " + count);
		System.out.println("Produto dos pares: " + produto);
	}
	
}
