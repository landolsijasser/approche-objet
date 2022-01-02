package maps;

import java.util.HashMap;

public class CerationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Salaire> mapSalaire = new HashMap<>();
		mapSalaire.put("Paul", new Salaire(1750));
		mapSalaire.put("Hicham", new Salaire(1825));
		mapSalaire.put("Yu", new Salaire(2250));
		mapSalaire.put("Ingrid", new Salaire(2015));
		mapSalaire.put("Chantal", new Salaire(2418));
		System.out.println(mapSalaire.size());
	}

}
