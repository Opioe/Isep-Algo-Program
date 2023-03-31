package mainpack;


import mainpack.character.Wizard;

import java.util.Scanner;
//import du temps


public class Main {
    public static Scanner scan;

    public static void main(String[] args) {
        long chronoSpeedRunBegin = System.currentTimeMillis();
        int level = 1;
        Game game = new Game();
        Wizard wizard = game.startGame();
        while (level < 9) {
            level = Level.selectLevel(level, wizard);
        }
        long chronoSpeedRunEnd = System.currentTimeMillis();
        System.out.println("You finished the game in " + (chronoSpeedRunEnd - chronoSpeedRunBegin) / 1000 + " seconds and " + (chronoSpeedRunEnd - chronoSpeedRunBegin) % 1000 + " milliseconds");
    }
}