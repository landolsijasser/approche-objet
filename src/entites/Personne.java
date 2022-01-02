package entites;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adresse;

	Personne(String name, String surname) {
		nom = name;
		prenom = surname;
	}

	public void affichageIdentite() {
		System.out.println("je m'appelle" + " " + nom + " " + prenom);

	}
}
