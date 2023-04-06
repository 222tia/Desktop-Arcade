package edu.bsu.cs222;

import java.io.IOException;
import java.util.Scanner;

public class PlayDesktopArcade extends DesktopArcadeDialogue{
    public static void main(String[] args) throws IOException {
        Scanner userChoice = new Scanner(System.in);
        String GameSelection;
        do {
            DesktopArcadeDialogue.startUpDialogue();
            //edu.bsu.cs222.DesktopArcadeDialogue.exitProgram();
            GameSelection = userChoice.nextLine();
            if (GameSelection.equals("1")) {
                DesktopArcadeDialogue.RPSRules();
                RPSGame.playRPS();
            }
            if (GameSelection.equals("2")) {
                DesktopArcadeDialogue.BuncoRules();
                BuncoGame.playBunco();
            }
            if (GameSelection.equals("3")) {
                DesktopArcadeDialogue.TTTRules();
                TTTGame.playTTT();
            }
            if (GameSelection.equals("x")) {
                DesktopArcadeDialogue.exit();
            }else{
                DesktopArcadeDialogue.incorrectInput();
            }
        }while(!GameSelection.equals("1")&& !GameSelection.equals("2") && !GameSelection.equals("3"));
    }
}