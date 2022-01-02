package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorPopulation implements Comparator<Ville> {

	@Override
	public int compare(Ville v1, Ville v2) {

		return v1.getPopulationTotale() - v2.getPopulationTotale();

	}

}
