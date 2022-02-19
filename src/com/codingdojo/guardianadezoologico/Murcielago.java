package com.codingdojo.guardianadezoologico;

public class Murcielago extends Mamifero {
	private static String soundString = "hooooooooo";
	
	public Murcielago() {
		super();
		setEnergy(300);
		
	}
	public void volar() {
		System.out.println("------------volar--------------------");
		int energy = displayEnergy();
		System.out.println(soundString);
		setEnergy(energy-50);
		displayEnergy();
	}
	public void comerHumanos() {
		System.out.println("------------comer humanos--------------------");
		int energy = displayEnergy();
		System.out.println(soundString+" comiendo");
		setEnergy(energy+25);
		displayEnergy();
	}
	public void atacarPueblo() {
		System.out.println("------------atacar pueblo--------------------");
		int energy = displayEnergy();
		System.out.println(soundString+" crack crack");
		setEnergy(energy-100);
		displayEnergy();
	}
	
}
