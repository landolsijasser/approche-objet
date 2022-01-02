package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	
	private int nbrJours;
	
	private double salaireJour;

	
	
	public Pigiste(String nom, String prenom, int nbrJours, double salaireJour) {
		super(nom, prenom);
		this.nbrJours = nbrJours;
		this.salaireJour = salaireJour;
	}

	@Override
	public double getSalaire() {
		return this.nbrJours * this.salaireJour;
	}

	@Override
	public void afficherDonnees() {
		System.out.println("=================================");
		System.out.println("Nom : " + this.nom);
		System.out.println("Prenom : " + this.prenom);
		System.out.println("Salaire : " + this.getSalaire());
		System.out.println("Statut : Pigiste");
		System.out.println("=================================");
	}

}
