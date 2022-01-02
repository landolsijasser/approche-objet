package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Rectangle;

public class AffichageForme {

	public static void main(String[] args) {

		Cercle cercle = new Cercle(5);
		Rectangle rectangle = new Rectangle(5);
		rectangle.setLargeur(2);
	Carre carre = new Carre(10);
	System.out.println(carre.calculerSurface());
		// ----
		
		
	}

}
