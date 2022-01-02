package fr.diginamic.jdr;

public class Loup extends Creature {

	public Loup() {
		this.force = (int) ((Math.random() * (8 - 3)) + 3);
		this.pointVie = (int) ((Math.random() * (10 - 5)) + 5);
	}
}
