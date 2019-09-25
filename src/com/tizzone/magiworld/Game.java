package com.tizzone.magiworld;

import java.util.Scanner;

public class Game {
	private int qtyPlayer=2;

	private Character character;

	public Character getCharacter() {
		return character;
	}

	public void displayCreationPlayer(int nbPLayer){

			System.out.println("Création du personnage du Joueur" + nbPLayer);
		}

	public void chooseCharacter(){

		System.out.println("Veuillez choisir la classe de votre personnage (1: Guerrier, 2: Rôdeur, 3: Mage )");
	}

    public void runGames() {
		for (int i=0;i<qtyPlayer;i++)
		{
			displayCreationPlayer(i);
			runGame();
		}
    }

	public void runGame() {
		chooseCharacter();
	}
}
