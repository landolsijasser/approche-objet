package entites;

public class AdressePostale {
	int numeroRue;
	String libelleRue;
	int codePostal;
	String ville;
	AdressePostale(int num, String libelle, int code, String nville){
		numeroRue = num;
		libelleRue = libelle;
		codePostal = code;
		ville = nville;
		
	}
	@Override
	public String toString() {
		return "AdressePostale [numeroRue=" + numeroRue + ", libelleRue=" + libelleRue + ", codePostal=" + codePostal
				+ ", ville=" + ville + "]";
	}

		
		
		
		


	

}
