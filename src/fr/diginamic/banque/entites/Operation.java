package fr.diginamic.banque.entites;

public abstract class Operation {
	String date;
	int montant;
	public Operation(String date, int montant) {
		super();
		this.date = date;
		this.montant = montant;
		public abstract String getType();
		
	}
}