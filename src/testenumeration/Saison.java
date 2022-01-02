package testenumeration;

import java.util.Arrays;
import java.util.List;

public enum Saison {
	PRINGTEMPS("Pringtemps", 1), ETE("Eté", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	private String libelle;
	private int odre;

	private Saison(String libelle, int odre) {
		this.libelle = libelle;
		this.odre = odre;
	}

	public Saison getthesaison(String libelle) {

		List<Saison> saisons = Arrays.asList(Saison.values());
		for (Saison s : saisons) {
			if (libelle.equals(s.getLibelle())) {
				return s;
			}

		}
		return null;
	}

	public String getLibelle() {
		return libelle;
	}

	public int getOdre() {
		return odre;
	}

}
