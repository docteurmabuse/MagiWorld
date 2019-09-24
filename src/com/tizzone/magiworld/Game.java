package com.tizzone.magiworld;

public class Game {
	private Character character;

	public Character getCharacter() {
		return character;
	}
	public void displayCreationPlayer(){
		System.out.println("Création du personnage du Joueur  1");
	}
	public void chooseCharacter(){
		System.out.println("Veuillez choisir la classe de votre personnage (1: Guerrier, 2: Rôdeur, 3: Mage");
	}
}
