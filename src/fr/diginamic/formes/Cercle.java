package fr.diginamic.formes;

public class Cercle extends Forme {
double rayon;
double pi = 3.14;

public Cercle(double rayon) {
	super();
	this.rayon = rayon;
}

@Override
public double calculerSurface() {
	return this.pi * this.rayon * this.rayon;
}

@Override
public double calculerPerimetre() {
	return pi * rayon * 2;
}
}
