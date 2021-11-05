package entites;

public class personne {
	 public String nom;
	public String prenom;
	public AdressePostale adresse;
	personne(String name, String surname){
		nom = surname;
		prenom = name;
		
	}
	@Override
	public String toString() {
		return "personne [nom=" + nom + ", prenom=" + prenom + "]";
	}

}
