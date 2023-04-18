package edu.bsu.cs222;

import java.io.IOException;
import java.util.Scanner;

public class PlayDesktopArcade extends DesktopArcadeDialogue {
    public static void main(String[] args) throws IOException {
        Scanner gameChoice = new Scanner(System.in);
        String GameSelection;
        do {
            System.out.println(DesktopArcadeDialogue.startUpDialogue());
            GameSelection = gameChoice.nextLine();
            if (GameSelection.equals("1")) {
                System.out.println(DesktopArcadeDialogue.RPSRules());
                RPSGame.playRPS();
            }
            if (GameSelection.equals("2")) {
                System.out.println(DesktopArcadeDialogue.multiplayerSelect());
                BuncoPlayerSelect();
            }
            if (GameSelection.equals("3")) {
                System.out.println(DesktopArcadeDialogue.multiplayerSelect());
                TTTPlayerSelect();
            }
            if (GameSelection.equals("x")) {
                DesktopArcadeDialogue.exit();
            } else {
                DesktopArcadeDialogue.incorrectInput();
            }
        } while (!GameSelection.equals("1") && !GameSelection.equals("2") && !GameSelection.equals("3"));
    }

    public static void BuncoPlayerSelect() throws IOException {
        Scanner playerChoice = new Scanner(System.in);
        String playerSelection;
        do {
            playerSelection = playerChoice.nextLine();
            if (playerSelection.equals("1")) {
                System.out.println(DesktopArcadeDialogue.BuncoRules());
                BuncoGame.playBunco();
            } else if (playerSelection.equals("2")){
                BuncoMultiplayer.playBuncoMultiplayer();
            } else {
                DesktopArcadeDialogue.incorrectInput();
            }
        } while (!playerSelection.equals("1") && (!playerSelection.equals("2")));
    }

    public static void TTTPlayerSelect() throws IOException {
        Scanner playerChoice = new Scanner(System.in);
        String playerSelection;
        do {
            playerSelection = playerChoice.nextLine();
            if (playerSelection.equals("1")) {
                System.out.println(DesktopArcadeDialogue.TTTRules());
                TTTGame.playTTT();
            } else if (playerSelection.equals("2")){
                TTTMultiplayer.playTTTMultiplayer();
            } else {
                DesktopArcadeDialogue.incorrectInput();
            }
        } while (!playerSelection.equals("1") && (!playerSelection.equals("2")));
    }

}