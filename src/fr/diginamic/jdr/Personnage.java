package fr.diginamic.jdr;

public class Personnage {
	
	int force;
	int pointVie;
	int score = 0;
	
	public Personnage() {
		this.force = (int) ((Math.random() * (18 - 12)) + 12);
		this.pointVie = (int) ((Math.random() * (50 - 20)) + 20);
	}
}
