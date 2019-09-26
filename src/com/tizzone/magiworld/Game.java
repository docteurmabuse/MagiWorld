package com.tizzone.magiworld;

import com.tizzone.magiworld.player.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {
	Scanner sc = new Scanner(System.in);

	private int nblayer=2;
    private Map <Player, Integer> players = new HashMap<Player, Integer>();

	private Player player;

	public Player getPlayer() {
		return player;
	}

	public void addPlayers(){

	}
	public void displayCreationPlayer(int nbPLayer){

			System.out.println("Création du personnage du Joueur" + nbPLayer);
		}

	public void displayAvailableCharacter(){

		System.out.println("Veuillez choisir la classe de votre personnage (1: Guerrier, 2: Rôdeur, 3: Mage )");

	}
	public int askCapabilities(String category){
		System.out.println(category +" du personnage ?");
		int nbResponse=0;
		System.out.println(category +" du personnage ?");
		boolean responseIsGood;
		do {
			try {
				nbResponse=sc.nextInt();
				responseIsGood=(nbResponse >=0&&nbResponse<=100);
			}
			catch (Exception e) {
				sc.nextInt();
				responseIsGood=false;
			}
			if(responseIsGood){

			}
			else{
				System.out.println("Vous devez choisir le" + category + " du personnage entre 0 et 100");
			}
		}while (!responseIsGood);
		return  nbResponse;
	}
	public void runGames() {
		for (int i=0;i<nblayer;i++)
		{
			displayCreationPlayer(i+1);
			runGame();
		}
    }

	public void runGame() {
		this.displayAvailableCharacter();
		int nbCharacter = sc.nextInt();
		int level = 0;
		int constitution;
		int strength;
		this.DisplaySelectedCharacter( nbCharacter, level,  constitution,  strength,  dexterity,  intelligence);
	}



	public void DisplaySelectedCharacter (int nbCharacter,int level, int constitution, int strength, int dexterity, int intelligence) {
		switch (nbCharacter){
			case 1:
				System.out.println("Woarg je suis le Guerrier Joueur 1 niveau 10 je possède 50 de vitalité, 10 de force, 0 d'agilité et 0 d'intélligence");
				break;
			case 2:
				System.out.println("Woarg je suis le Rôdeur Joueur 1 niveau 10 je possède 50 de vitalité, 10 de force, 0 d'agilité et 0 d'intélligence");
				break;
			case 3:
				System.out.println("Woarg je suis le Mage Joueur 1 niveau 10 je possède 50 de vitalité, 10 de force, 0 d'agilité et 0 d'intélligence");
				break;
			default:
				System.out.println("Vous n'avez pas choisi de Classe parmi les choix proposés");
				break;
		}
	}
}
