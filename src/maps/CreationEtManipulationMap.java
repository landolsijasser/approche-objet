package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		HashMap<Integer, Ville> mapVilles = new HashMap<>();
		mapVilles.put(13, new Ville("Marseille"));
		mapVilles.put(34, new Ville("Montpellier"));
		mapVilles.put(44, new Ville("Nantes"));
		mapVilles.put(75, new Ville("Paris"));
		mapVilles.put(31, new Ville("Toulouse"));
		mapVilles.put(59, new Ville("Lile"));
		mapVilles.put(69, new Ville("Lyon"));
		mapVilles.put(30, new Ville("Bordeaux"));

		Iterator<Ville> iterVilles = mapVilles.values().iterator();
		while (iterVilles.hasNext()) {
			Ville ville = iterVilles.next();

			System.out.println( ville);
		}

		Iterator<Integer> iterCles = mapVilles.keySet().iterator();
		while (iterCles.hasNext()) {
			Integer cle = iterCles.next();
			Ville ville = mapVilles.get(cle);
			System.out.println(cle + " - " + ville);
		}
		System.out.println(mapVilles.size());
	}
	

}
