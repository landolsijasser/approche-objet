package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		// Exercice CalculSalaire
		
		// Salarie
		Salarie salarie = new Salarie("Fr", "Fred", 1500.50);
		System.out.println("Le salaire est : " + salarie.getSalaire());
		salarie.afficherDonnees();
		
		// Indep
		Pigiste pigiste = new Pigiste("M", "Marie", 10, 50.2);
		System.out.println("Le salaire de l'indep est : " + pigiste.getSalaire());
		pigiste.afficherDonnees();

	}

}
