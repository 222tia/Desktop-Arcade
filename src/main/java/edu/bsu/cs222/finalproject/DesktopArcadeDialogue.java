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
        System.out.println("""
                In Rock, Paper, Scissors! You will play a best of 3 against an AI by
                playing Rock, Paper, or Scissors.
                
                The winner of the round is determined by these rules:
                
                1.) Rock beats Scissors.
                2.) Scissors beats Paper.
                3.) Paper beats Rock.
                
                """);
    }
    public static void BuncoRules(){
        System.out.println("""
                Bunco is played by rolling 3 dice.
                Rounds are numbered from 1 to 6 before looping back to 1.
                When you gain points you get to roll again! When no points are gained play passes and your turn is over.
                Hit enter to continue play.
                
                1 point is gained when a dice roll is equal to the round number.
                5 points are gained when triples are rolled.
                If the triples match the round number, you automatically win!!
                
                Otherwise, the winner is the first to get to 21 points!""");
    }
    public static void exitProgram(){
        System.out.println("To exit the program at any time, press 'x'");
    }
    public static void incorrectInput(){
        System.out.println("Input not an option. Please try again.");
    }
}

