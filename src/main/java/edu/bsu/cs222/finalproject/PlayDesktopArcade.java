package edu.bsu.cs222.finalproject;

import java.io.IOException;
import java.util.Scanner;

public class PlayDesktopArcade extends DesktopArcadeDialogue{
    public static void main(String[] args) throws IOException {
        Scanner userChoice = new Scanner(System.in);
        String GameSelection;
        do {
            DesktopArcadeDialogue.startUpDialogue();
            GameSelection = userChoice.nextLine();
            if (GameSelection.equals("1")) {
                DesktopArcadeDialogue.RPSRules();
                RPSGame.playRPS();
            }
            if (GameSelection.equals("2")) {
                DesktopArcadeDialogue.BuncoRules();
                BuncoGame.playBunco();
            } else {
                DesktopArcadeDialogue.incorrectInput();
            }
        }while(!GameSelection.equals("1")&& !GameSelection.equals("2"));
    }
}
