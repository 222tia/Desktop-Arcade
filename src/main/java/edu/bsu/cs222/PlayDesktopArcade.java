package edu.bsu.cs222;

import edu.bsu.cs222.Bunco.BuncoGame;
import edu.bsu.cs222.RPS.RPSGame;
import edu.bsu.cs222.TTT.TTTGame;

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
                BuncoGame.playBunco(1);
            } if (playerSelection.equals("2")){
                BuncoGame.playBunco(2);
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
                TTTGame.playTTTSingle();
            } if (playerSelection.equals("2")){
                TTTGame.playTTTMulti();
            } else {
                DesktopArcadeDialogue.incorrectInput();
            }
        } while (!playerSelection.equals("1") && (!playerSelection.equals("2")));
    }

}