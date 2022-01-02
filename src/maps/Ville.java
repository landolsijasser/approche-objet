package maps;

public class Ville {
	private String nom;

	public Ville(String nom) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
