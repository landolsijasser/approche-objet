package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.Wc;

public class TestMaison {

	public static void main(String[] args) {
		
		Maison maison = new Maison();
		
		// Pieces de la maison
		Chambre chambre = new Chambre(20.1, 0);
		Chambre chambre2 = new Chambre(15, 0);
		Chambre chambre3 = new Chambre(19, 1);
		
		Wc wc = new Wc(2, 0);
		Wc wc2 = new Wc(2, 1);
		
		Salon salon = new Salon(45, 0);
		
		Cuisine cuisine = new Cuisine(20, 0);
		
		// ajouter les pieces
		maison.ajouterPiece(chambre);
		maison.ajouterPiece(chambre2);
		maison.ajouterPiece(chambre3);
		
		maison.ajouterPiece(wc);
		maison.ajouterPiece(wc2);
		
		maison.ajouterPiece(salon);
		
		maison.ajouterPiece(cuisine);

		// Surface de la maison
		System.out.println("La surface de la maison est : " + maison.surfaceMaison());
		
		// nombre de piece par etage
		System.out.println("La surface de l'etage est : " + maison.surfacePieceEtage(1));
		
		// si on passe null dans la methode ajouterPiece ça retourne une erreur
		// maison.ajouterPiece(null);
		// apres le controle if(piece != null) on ajoute pas null au tableau
		
		// Que se passe t�il si la pi�ce � une superficie ou un �tage n�gatif ?
		// la piece est ajout�e avec les valeurs negatifs
		// apres le controle : on affiche un message d'erreur si on a une valeur negative
		Chambre chambre4 = new Chambre(-10, 1);
		maison.ajouterPiece(chambre4);
		
		// surface des chambres
		System.out.println("Surface des chambres : " + maison.surfacePiecesType("chambre"));
		
		// surface des Wc
		System.out.println("Surface des Wc : " + maison.surfacePiecesType("wc"));
		
		// nombre de Wcs
		System.out.println("Nombre de Wcs : " + maison.nbrPieceType("wc"));
		
		// nombre de chambres
		System.out.println("Nombre de chambres : " + maison.nbrPieceType("chambre"));
		
	}

}
