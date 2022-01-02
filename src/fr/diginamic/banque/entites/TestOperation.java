package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Credit c1 = new Credit("24/12/1990", 123);
		Credit c2 = new Credit("21/12/1990", 123);
		Debit d1 = new Debit("22/12/1990", 124);
		Debit d2 = new Debit("23/12/1990", 125);
		Operation[] operations = { c1, c2, d1, d2 };

		for (int i = 0; i < operations.length; i++) {
			System.out.println(operations[i]);

		}
	}

}
