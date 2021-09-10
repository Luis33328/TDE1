package com.Ex24;

public class Automovel extends Veiculo{
	
	int marcha = 1;

	public void passarMarcha() {
		marcha++;
		System.out.println("Marcha atual: " + marcha + "a");
	}
}
