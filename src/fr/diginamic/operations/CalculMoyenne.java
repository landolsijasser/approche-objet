package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
	public double[] tab = new double[0];

	public void ajout(double c) {
		tab = Arrays.copyOf(tab, tab.length + 1);
		tab[tab.length - 1] = c;
	}

	public double calcul() {
		double total = 0;
		for (int i = 0; i < tab.length; i++) {
			total = total + tab[i];

		}
		return total / tab.length;
	}
}