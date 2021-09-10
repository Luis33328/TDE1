package com.Ex3;

public class CPU extends Hardware {
	
	
	/**
	 * Declarção de variáveis
	 */
	public int id;
	

	/**
	 * Método para printar os dados do objeto
	 */
	public void printData() {
		System.out.println("Nome: " + name + "\n" + "Preço: " + price + "\n" + "Marca: " + brand + "\n" + "ID: " + id );
	}
}
