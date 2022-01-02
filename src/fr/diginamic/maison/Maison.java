package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
	
	Piece[] pieces = {};
	
	public void ajouterPiece(Piece piece) {
		if (piece != null) {
			if (piece.etage >= 0 && piece.surface > 0) {
				// instancier un tableau tempo plus grans que le tableau val d'une case pour pouvoir 
				// inserer la nouvelle valeur
				Piece[] localValeurs = new Piece[this.pieces.length + 1];
				
				// inserer toutes les vals du tableau valeurs dans le tableau tempo (plus grand) 
				for (int i = 0; i < this.pieces.length; i++) {
					localValeurs[i] = this.pieces[i];
				}
				
				// inserer la nouvelle valeur dans le tableau tempo
				localValeurs[localValeurs.length - 1] = piece;
				
				
				// remettre tout le contenu du tableau temp dans le tableau valeurs
				this.pieces = localValeurs;
			} else {
				System.err.println("Il ne faut pas passer une valeur negative pour l'etage ou la surface");
			}
		}
	}
	
	// surface de toutes les pieces
	public double surfaceMaison() {
		double surface = 0;
		
		for (int i = 0; i < pieces.length; i++) {
			surface = surface + pieces[i].surface;
		}
		
		return surface;
	}
	
	// surface des pieces par etage
	public double surfacePieceEtage(int etage) {
		double surface = 0;
		
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].etage == etage) {
				surface = surface + pieces[i].surface;
			}
		}
		
		return surface;
	}
	
	// surface des pieces par type
	public double surfacePiecesType(String type) {
		double surface = 0;
		
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getClass().getSimpleName().toLowerCase().equals(type)) {
				surface = surface + pieces[i].surface;
			}
		}
		
		return surface;
	}
	
	// nombre de pieces par type
	public int nbrPieceType(String type) {
		int nbrPieceType = 0;
		
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getClass().getSimpleName().toLowerCase().equals(type)) {
				nbrPieceType++;
			}
		}
		
		return nbrPieceType;
	}
	
}
