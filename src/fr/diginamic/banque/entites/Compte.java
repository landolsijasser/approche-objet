package fr.diginamic.banque.entites;

public class Compte {
	private int numeroDeCompte;
	private int soldeDeCompte;

	public Compte(int num, int solde) {
		numeroDeCompte = num;
		soldeDeCompte = solde;
	}

	public int getnumeroDeCompte() {
		return numeroDeCompte;
	}

	public int getsoldeDeCompte() {
		return soldeDeCompte;
	

	}
	public void setnumeroDeCompte(int num) {
		numeroDeCompte = num;
	}

	@Override
	public String toString() {
		return "Compte [numeroDeCompte=" + numeroDeCompte + ", soldeDeCompte=" + soldeDeCompte + "]";
	}

	
}
