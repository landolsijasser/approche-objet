package fr.diginamic.formes;

public class Rectangle extends Forme {
double longueur;
double largeur;



public Rectangle(double longueur) {
	super();
	this.longueur = longueur;
}


public Rectangle(double longueur, double largeur) {
	super();
	this.longueur = longueur;
	this.largeur = largeur;
}


@Override
public double calculerSurface() {
	return longueur * largeur;
}
@Override
public double calculerPerimetre() {
	return 2 * (largeur + longueur);
}

public double getLargeur() {
	return largeur;
}
public void setLargeur(double largeur) {
	this.largeur = largeur;
}
@Override
public String toString() {
	return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
}
}
