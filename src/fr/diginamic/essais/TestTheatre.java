package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {

		Theatre t1 = new Theatre("jasser", 150);
		t1.inscrire(8, 7);
		
		System.out.println(t1.getName());
		System.out.println(t1);
		t1.inscrire(20, 7);
		System.out.println(t1);
		t1.inscrire(105, 7);
		System.out.println(t1);
	}

}
