package edu.bsu.cs222;

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
                System.out.println(DesktopArcadeDialogue.RPSRules());
                RPSGame.playRPS();
            }
            if (GameSelection.equals("2")) {
                System.out.println(DesktopArcadeDialogue.BuncoRules());
                BuncoGame.playBunco();
            }
            if (GameSelection.equals("3")) {
                System.out.println(DesktopArcadeDialogue.TTTRules());
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