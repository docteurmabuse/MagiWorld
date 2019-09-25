package com.tizzone.magiworld;

import com.tizzone.magiworld.player.Player;

public class Main {
    public static void main(String[] args) {
        int nbLevel=0;
        int nbConstitution=nbLevel*5;
        int nbStrength=0;
        int nbDextreity=0;
        int nbIntel = 0;
        Player player1 = new Player(nbLevel,nbConstitution,nbStrength,nbDextreity,nbIntel);
        Game game = new Game();
        game.runGame();
    }
}
