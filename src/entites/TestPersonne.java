package entites;

import entites2.personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		personne per1 = new personne();
		per1.nom = "landolsi";
		per1.prenom = "jasser";
		per1.adresse = new AdressePostale();
		per1.adresse.numeroRue = 5;
		per1.adresse.libelleRue = "boulevard";
		per1.adresse.codePostal = 34000;
		per1.adresse.ville = "Montpellier";
		personne per2 = new personne();
		per2.nom = "landolsi";
		per2.prenom = "jasser";
		per2.adresse = new AdressePostale();
		per2.adresse.numeroRue = 5;
		per2.adresse.libelleRue = "boulevard";
		per1.adresse.codePostal = 34000;
		per2.adresse.ville = "Montpellier";

	}

}
