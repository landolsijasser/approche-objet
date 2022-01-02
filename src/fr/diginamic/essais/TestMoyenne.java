package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {

		CalculMoyenne c1 = new CalculMoyenne();
		c1.ajout(2.1);
		c1.ajout(2.5);
		c1.ajout(9.3);

		
		System.out.println(c1.calcul());
	}

}
