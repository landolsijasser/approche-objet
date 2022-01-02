package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	
	private double salaireMensuel = 0;

	public Salarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}

	@Override
	public double getSalaire() {
		return this.salaireMensuel;
	}

	@Override
	public void afficherDonnees() {
		System.out.println("=================================");
		System.out.println("Nom : " + this.nom);
		System.out.println("Prenom : " + this.prenom);
		System.out.println("Salaire : " + this.getSalaire());
		System.out.println("Statut : Salarie");
		System.out.println("=================================");
		
	}

	

}
