package fr.diginamic.essais;

public class Operations {
	static double calcul(double a, double b, char c) {
		if (c == '+') {
			double calcul = a + b;
			return calcul;

		}
		if (c == '-') {
			double calcul = a - b;
			return calcul;
		} else
			return 0.0;
	}
}