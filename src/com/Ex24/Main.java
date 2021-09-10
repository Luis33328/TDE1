package com.Ex24;

public class Main {

	public static void main(String[] args) {
		
		Ferrari f40 = new Ferrari();
		Moto hornet = new Moto();
		
		f40.modelo = "F40";
		
		f40.abastecer();
		f40.acelerar();
		f40.passarMarcha();
		
		hornet.modelo = "Hornet";
		
		hornet.abastecer();
		hornet.acelerar();
		hornet.buzinar();
	}
	
}
