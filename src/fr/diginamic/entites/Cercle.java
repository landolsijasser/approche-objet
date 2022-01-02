package fr.diginamic.entites;

public class Cercle {
	double rayon;
	double pi = 3.14;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;

	}

	public double perimetre() {

		return rayon * 2 * pi;
	}

	public double surface() {
		double carré = rayon * rayon;
		return carré * pi;
	}
}
