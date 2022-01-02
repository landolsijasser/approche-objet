package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	private int taux;
	public CompteTaux(int  num, int solde, int taux) {
		super(num, solde);
		this.taux = taux;
		
		
	}
	public String toString() {
		return super.toString() + "taux" + taux;
	}
}
