package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		char premierCaractere = chaine.charAt(0);
		System.out.println("premier caractère : " + premierCaractere);
		int c = chaine.length();
		System.out.println(c);
		int b = chaine.indexOf(';');
		System.out.println(b);
		int start = chaine.indexOf('D');
		int end = chaine.indexOf(';');
		System.out.println(start);
		System.out.println(end);
		String name = chaine.substring(start, end);
		System.out.println(name);
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		String[] mots = chaine.split(";");
		/*for (String word : mots) {
			System.out.println("les sous chaines sont" + ":" + word);
		}*/
		// ------------------------------------
		// declarer un salarie
		Salarie salarie;
		// instancier salarier avaec constructeur par defaut
		salarie = new Salarie();
		String nom = "ahmed";
		String prenom = "caf";
		salarie.setNom(nom);
		salarie.setPrenom(prenom);
		salarie.setSalaire(1520.4);
		System.out.println(salarie);

		// Salarie avec constructeur 1
		Salarie salarie2 = new Salarie("Med", "med");
		System.out.println(salarie2);
		// salarie avec constr 3
		Salarie salarie3 = new Salarie("Med", "tom", 2500.40);
		System.out.println(salarie3);
		// --------------------------------
		Salarie salarie4 = new Salarie();
		
		String salaireStr = mots[2].replace(" ", "");
		
		double salaireDouble = Double.parseDouble(salaireStr);

		salarie4.setSalaire(salaireDouble);
		salarie4.setNom(mots[0]);
		salarie4.setPrenom(mots[1]);
		System.out.println(salarie4);
	}

}
