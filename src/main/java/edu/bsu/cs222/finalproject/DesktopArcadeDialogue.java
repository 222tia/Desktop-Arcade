package edu.bsu.cs222.finalproject;

public class DesktopArcadeDialogue {
    public static void startUpDialogue(){
        System.out.println("""
                Welcome to Desktop Arcade
                To play, please enter the number of the corresponding game:
                1.) Rock Paper Scissors!
                2.) Bunco!""");
    }
    public static void RPSRules(){
        System.out.println("dialogue1");
    }
    public static void BuncoRules(){
        System.out.println("dialogue2");
    }
    public static void incorrectInput(){
        System.out.println("Input not an option. Please try again.");
    }
}

