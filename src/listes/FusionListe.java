package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {
		// deux listes fournis
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		// ArrayList qui fusionne A et B
		ArrayList<String> liste3 = new ArrayList<>();
		liste3.addAll(liste1);
		liste3.addAll(liste2);
		System.out.println("\nListe 3");
		// Afficher la liste finale après la fusion
		for (String objet : liste3) {
			System.out.println(objet);
		}
	}

}
