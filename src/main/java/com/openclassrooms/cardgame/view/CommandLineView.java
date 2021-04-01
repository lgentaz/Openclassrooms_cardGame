package com.openclassrooms.cardgame.view;

import com.openclassrooms.cardgame.controller.GameController;

import java.util.Scanner;

public class CommandLineView implements GameViewable{
    GameController controller;
    Scanner keyboard = new Scanner(System.in);

    public void setController(GameController gc){
        this.controller = gc;
    }

    public void promptForPlayerName() {
        System.out.println("Enter Player Name");
        String name = keyboard.nextLine();
        if (name.isEmpty()){
            controller.startGame();
        } else {
            controller.addPlayer(name);
        }
    }

    public void promptForFlip() {
        System.out.println("Press enter to return cards");
        keyboard.nextLine();
        controller.flipCards();
    }

    public void promptForNewGame() {
        System.out.println("Press enter to deal again");
        keyboard.nextLine();
        controller.startGame();
    }

    public void showPlayerName(int playerIndex, String playerName) {
        System.out.println("[" + playerIndex + "] [" + playerName + "]");
    }

    public void showFaceDownCardForPlayer(int playerIndex, String playerName) {
        System.out.println("[" + playerIndex + "] [" + playerName + "]");
    }

    public void showCardForPlayer(int playerIndex, String playerName, String rank, String suit) {
        System.out.println("[" + playerIndex + "] [" + playerName +"] [" + rank + "] [" + suit +"]");
    }

    public void showWinner(String winnerName) {
        System.out.println("Winner : " + winnerName + "!");
    }

}
