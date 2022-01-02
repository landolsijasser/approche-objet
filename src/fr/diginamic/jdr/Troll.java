package fr.diginamic.jdr;

public class Troll extends Creature {

	public Troll() {
		this.force = (int) ((Math.random() * (15 - 10)) + 10);
		this.pointVie = (int) ((Math.random() * (30 - 20)) + 20);
	}
	
}
