package com.codingdojo.guardianadezoologico;

public class Mamifero {
	// //// VARIABLES /////////////////////
	private int energy;
	// //// CONSTRUCTOR ///////////////////
	public Mamifero() {
		this.energy = 100;
	}
	// //// GETTERS and SETTTERS ///////////
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	// //// DISPLAY ENERGY ////////////////
	public int displayEnergy() {
		if (getEnergy()>0) {
			System.out.println("Energia: "+getEnergy());
			return getEnergy();	
		} else {
			System.out.println("Sin energia");
			return 0;
		}
		
	}
}
