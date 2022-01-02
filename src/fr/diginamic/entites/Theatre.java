package fr.diginamic.entites;

public class Theatre {
	private String name;
	private int nbmax;

	private int nbClients;
	private int recetteTotale;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNbmax() {
		return nbmax;
	}

	public void setNbmax(int nbmax) {
		this.nbmax = nbmax;
	}

	public int getNbClients() {
		return nbClients;
	}

	public void setNbClients(int nbClients) {
		this.nbClients = nbClients;
	}

	public int getRecetteTotale() {
		return recetteTotale;
	}

	public void setRecetteTotale(int recetteTotale) {
		this.recetteTotale = recetteTotale;
	}

	public Theatre(String name, int nbmax) {
		super();
		this.name = name;
		this.nbmax = nbmax;
	}

	public void inscrire(int nb, int prix) {

		if (nbClients + nb <= nbmax) {

			this.nbClients = this.nbClients + nb;

			recetteTotale = recetteTotale + (nb * prix);

		}

		else {
			System.out.println("error");
		}

	}

	@Override
	public String toString() {
		return "Theatre [nbClients=" + nbClients + ", recetteTotale=" + recetteTotale + "]";
	}
}