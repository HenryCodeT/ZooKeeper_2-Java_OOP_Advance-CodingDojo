package com.codingdojo.guardianadezoologico;

public class Gorila extends Mamifero {
	public Gorila() {
		super();
	}
	public void lanzaAlgo() {
		int energy = displayEnergy();
		int lostEnergy = 5;
		System.out.println("Ha lanzado algo");
		setEnergy(energy-lostEnergy);
		displayEnergy();
	}
	public void comerBananas() {
		int energy = displayEnergy();
		int gainEnergy = 10;
		System.out.println("Ha comido bananas");
		setEnergy(energy+gainEnergy);
		displayEnergy();
	}
	public void escalar() {
		int energy = displayEnergy();
		int lostEnergy = 10;
		System.out.println("Ha escalado");
		setEnergy(energy-lostEnergy);
		displayEnergy();
	}
}
