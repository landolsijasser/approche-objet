package fr.diginamic.jdr;

public class Game {

	Personnage personnage;

	Creature creature;

	public void ajouterPersonnage(Personnage personnage) {
		this.personnage = personnage;
		System.out.println("Le personnage a �t� ajout� eu jeu => force : " + this.personnage.force
				+ " et point de vie : " + this.personnage.pointVie);
	}

	public void ajouterCreature() {
		// nombre aleatoire entre 1 et 3 tel que 1 = loup, 2 = gobelin et 3 = troll
		int candidat = (int) ((Math.random() * (3 - 1)) + 1);
		if (candidat == 1) {
			this.creature = new Loup();
		} else if (candidat == 2) {
			this.creature = new Gobelin();
		} else {
			this.creature = new Troll();
		}
		System.out.println("Vos competences " + this.personnage.getClass().getSimpleName() + " force : "
				+ this.personnage.force + " et point de vie : " + this.personnage.pointVie);
		System.out.println("Vous aller jouer contre un " + this.creature.getClass().getSimpleName() + " force : "
				+ this.creature.force + " et point de vie : " + this.creature.pointVie);
	}

	public boolean combat() {
		// tours du combat
		int tour = 1;
		while (this.personnage.pointVie > 0 && this.creature.pointVie > 0) {
			// Calculer les valeurs des attaques
			int attaquePeronnage = this.personnage.force + (int) ((Math.random() * (11 - 1)) + 1);
			int attaqueCreature = this.creature.force + (int) ((Math.random() * (11 - 1)) + 1);

			System.out
					.println("- valeurs d'attaques : Pers(" + attaquePeronnage + ") vs Creat(" + attaqueCreature + ")");

			// calculer le degat
			int degat = attaquePeronnage - attaqueCreature;
			if (degat < 0) {
				degat = degat * (-1);
			}

			// soustraire le degat du perdant
			if (attaquePeronnage < attaqueCreature) {
				this.personnage.pointVie = this.personnage.pointVie - degat;
			}

			// soustraire le degat du perdant
			if (attaquePeronnage > attaqueCreature) {
				this.creature.pointVie = this.creature.pointVie - degat;
			}
			System.out.println("Tour " + tour + " : degat = " + degat + " point de vie Pers ("
					+ this.personnage.pointVie + ") et Creat(" + this.creature.pointVie + ")");

			tour++;

		}

		// verifier gagnant et refraichir le score
		boolean gagnant = false; // true = personnage et true = creation
		if (this.creature.pointVie <= 0) {
			gagnant = true;
			if (this.creature instanceof Loup) {
				this.personnage.score = this.personnage.score + 1;
				System.out.println("* Felicitation vous avez gagner 1 point de plus");
			} else if (this.creature instanceof Gobelin) {
				this.personnage.score = this.personnage.score + 2;
				System.out.println("* Felicitation vous avez gagner 2 point de plus");
			} else if (this.creature instanceof Troll) {
				this.personnage.score = this.personnage.score + 5;
				System.out.println("* Felicitation vous avez gagner 5 point de plus");
			}
			// � la fin du combat on remet la creature � null pour un prochain combat
			System.out.println("Fin de combat = point de vie Pers (" + this.personnage.pointVie + ") et Creat("
					+ this.creature.pointVie + ")");
			this.creature = null;
		}

		return gagnant;
	}

	public void afficherScore() {
		System.out.println("==> Le score est : " + this.personnage.score);
	}

	public int getScore() {
		return this.personnage.score;
	}

}
