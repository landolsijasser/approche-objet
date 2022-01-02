package fr.diginamic.entites;

import fr.diginamic.chaines.ManipulationChaine;

public class Salarie {
	private String nom;
	private String prenom;
	private double salaire;
	
	// constructeur par defaut
	public Salarie() {
		
	}
	
	// constructeur 1
	public Salarie(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	// constructeur 2
	public Salarie(String nom, String prenom, double salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Mon salarie [nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + "]";
	}
	
	

	
}
