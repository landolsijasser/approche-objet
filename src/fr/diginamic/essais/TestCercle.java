package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle calcul1 = new Cercle(5);
		Cercle calcul2 = new Cercle(7);
		double perim1 = calcul1.perimetre();
		double surf1 = calcul1.surface();
		System.out.println("le perimetre du cercle 1 est " + " " + perim1);
		System.out.println("la surface du cercle 1 est" + " " + surf1);
		double perim2 = calcul2.perimetre();
		double surf2 = calcul2.surface();
		System.out.println("le perimetre du cercle 2 est " + " " + perim2);
		System.out.println("la surface du cercle 2 est" + " " + surf2);
		Cercle c1 = CercleFactory.creerCercle(1.0);
		System.out.println(c1);

	}

}
