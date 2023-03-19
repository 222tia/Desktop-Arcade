package edu.bsu.cs222.finalproject;

import java.io.IOException;
import java.util.Scanner;

public class PlayDesktopArcade {
    public static void main(String[] args) throws IOException {
        Scanner userChoice = new Scanner(System.in);

        DesktopArcadeDialogue.startUpDialogue();

        if (userChoice.nextLine().equals("1")){
            DesktopArcadeDialogue.RPSRules();
            RPSGame.playRPS();
        }if (userChoice.nextLine().equals("2")){
            DesktopArcadeDialogue.BuncoRules();
            BuncoGame.playBunco();
        }else{
            DesktopArcadeDialogue.incorrectInput();
        }
    }
}
