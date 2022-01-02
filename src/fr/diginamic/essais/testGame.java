package fr.diginamic.essais;

import java.util.Scanner;

import fr.diginamic.jdr.Game;
import fr.diginamic.jdr.Personnage;

public class testGame {

	public static void main(String[] args) {
		
		Game game = new Game();
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("===============================Menu======================================");
			System.out.println(" - Créer le personnage : 1");
			System.out.println(" - Combattre une créature : 2");
			System.out.println(" - Afficher score : 3");
			System.out.println(" - Quitter : 4");
			System.out.printf("> ");
            String command = scanner.nextLine();
            if (command.equals("1")) {
            	Personnage personnage = new Personnage();
            	game.ajouterPersonnage(personnage);
            } else if (command.equals("2")) {
            	game.ajouterCreature();
            	if (game.combat() == false) {
            		System.out.println(" Votre personnage est décédé. Il a obtenu le score de " + game.getScore() + " points. Veuillez créer un nouveau personnage");
            	} else {
            		game.afficherScore();
            	}
            } else if (command.equals("3")) {
            	game.afficherScore();
            } else if (command.equals("4")) {
            	break;
            }
		}
		

	}

}
