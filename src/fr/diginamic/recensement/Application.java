package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

	public static void main(String[] args) throws IOException {
		// code de lecture du fichier
		Path path = Paths.get("C:/Users/andol/Downloads/recensement.csv");
		System.out.println(path);
		List<String> lignes = Files.readAllLines(path);
		boolean exists = Files.exists(path);
		System.out.println(exists);
		List<Ville> villes = new ArrayList<>();
		for (int i = 1; i < lignes.size(); i++) {

			String ligne = lignes.get(i);

			String[] morceaux = ligne.split(";");
			String codeRegion = morceaux[0];
			String nomRegion = morceaux[1];
			String codeDepartement = morceaux[2];
			String codeCommune = morceaux[5];
			String nomCommune = morceaux[6];
			String populationtotale = morceaux[9];
			int populationTotale = Integer.parseInt(populationtotale.replace(" ", "").trim());
			Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, ligne,
					populationTotale);

			villes.add(ville);

		}
		Ville selection = null;
		for (int i = 0; i < villes.size(); i++) {
			Ville ville = villes.get(i);
			if (ville.getNomCommune().equals("Montpellier"))
				selection = ville;

		}

		System.out.println(selection);

		int popTotale = 0;
		for (int i = 0; i < villes.size(); i++)

		{

			Ville ville = villes.get(i);
			if (ville.getCodeDepartement().equals("34"))
				popTotale = popTotale + ville.getPopulationTotale();

		}

		System.out.println("la population totale de l'herault est " + popTotale);

		List<Ville> herault = new ArrayList<>();
		for (int i = 0; i < villes.size(); i++) {
			Ville ville = villes.get(i);
			if (ville.getCodeDepartement().equals("34"))
				herault.add(ville);
		}
		Collections.sort(herault, new ComparatorPopulation());

		for (Ville v : herault) {

		}
		System.out.println("la ville la moins peuplée du departement herault est" + herault.get(0));

		for (int i = 0; i < 11; i++) {
			System.out.println(herault.get(i));

		}
		for (int i = herault.size() - 10; i < herault.size(); i++) {
			System.out.println(herault.get(i));
		}
		int popoccitanie = 0;
		for (int i = 0; i < villes.size(); i++)

		{

			Ville ville = villes.get(i);
			if (ville.getCodeRegion().equals("76"))
				popoccitanie = popoccitanie + ville.getPopulationTotale();

		}

		System.out.println("la population totale de l'occitanie est " + popoccitanie);
		System.out.println("------------------------------");

		Collections.sort(villes, new ComparatorPopulation());

		for (Ville v : villes) {
			if (v.getCodeRegion().equals("76"))
				System.out.println(v);

		}
		System.out.println("-------------------------------------------------");
		List<Ville> occitanie = new ArrayList<>();
		for (int i = 0; i < villes.size(); i++) {
			Ville ville = villes.get(i);
			if (ville.getCodeRegion().equals("76"))
				occitanie.add(ville);
		}
		for (int i = occitanie.size() - 10; i < occitanie.size(); i++) {
			System.out.println(occitanie.get(i));

		}
		System.out.println("--------------------------------");
		System.out.println(occitanie.get(occitanie.size() - 1));
		System.out.println("--------------------------------");

		
		}
	}
