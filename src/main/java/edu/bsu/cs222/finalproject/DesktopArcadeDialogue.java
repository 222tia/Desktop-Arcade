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
                Rock, Paper, Scissors is played by playing Rock, Paper, or Scissors.
                
                The winner is determined by these rules:
                
                Rock beats Scissors
                Scissors beats Paper
                Paper beats Rock
              
                """);
    }
    public static void BuncoRules(){
        System.out.println("""
                Bunco is played by rolling 3 dice.
                Rounds are numbered from 1 to 6 before looping back to 1.
                
                1 point is gained when a dice roll is equal to the round number.
                5 points are gained when triples are rolled.
                If the triples match the round number, you automatically win!!
                
                Otherwise, the winner is the first to get to 21 points!""");
    }
    public static void incorrectInput(){
        System.out.println("Input not an option. Please try again.");
    }
}
