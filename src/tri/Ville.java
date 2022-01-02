package tri;

import java.util.ArrayList;
import java.util.Collections;

public class Ville implements Comparable<Ville> {

	public Ville(String nom, int nbHabitants) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Ville> villes = new ArrayList<>();

		villes.add(new Ville("Nice", 343000));
		villes.add(new Ville("Carcassonne", 47800));
		villes.add(new Ville("Narbonne", 53400));
		villes.add(new Ville("Lyon", 484000));
		villes.add(new Ville("Foix", 9700));
		villes.add(new Ville("Pau", 77200));
		villes.add(new Ville("Marseille", 850700));
		villes.add(new Ville("Tarbes", 40600));
		Collections.sort(villes);
		System.out.println(villes);
	}
	/**
	 * @Override public int compareTo(Ville autre) { if (this.nbHabitants >
	 *           autre.getNbHabitants(){ return 1; } if (this.nbHabitants <
	 *           autre.getNbHabitants(){ return -1; }
	 * 
	 *           return 0; for (Ville: villes) { System.out.println(Ville); }
	 */

	@Override
	public int compareTo(Ville o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
