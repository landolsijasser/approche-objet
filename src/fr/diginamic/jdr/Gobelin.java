package fr.diginamic.jdr;

public class Gobelin extends Creature {

	public Gobelin() {
		this.force = (int) ((Math.random() * (10 - 5)) + 5);
		this.pointVie = (int) ((Math.random() * (15 - 10)) + 10);
	}
}
