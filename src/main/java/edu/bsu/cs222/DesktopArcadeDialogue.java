package edu.bsu.cs222;

import java.io.IOException;

@SuppressWarnings("SameReturnValue")
public class DesktopArcadeDialogue {
    public static void startUpDialogue(){
        System.out.println("""
                Welcome to Desktop Arcade
                To play, please enter the number of the corresponding game:
                1.) Rock Paper Scissors!
                2.) Bunco!
                3.) Tic Tac Toe!
                
                To exit the program, press 'x'""");
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
    public static void TTTRules() {
        System.out.println("""
                
                Tic-Tac-Toe is played by using a 3x3 grid.
                Players take turns to select a spot in the grid to put an X or an O.
                If a player gets 3 in a row vertically, horizontally, or diagonally they win!
                Press enter to continue play.
                """);
    }

    public static void incorrectInput(){
        System.err.println("Input not an option. Please try again.");
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    //allows user to press enter to continue play. The result of method is not needed.
    public static void EnterContinue() throws IOException {
        System.in.read();
    }

    protected static void exit() {
        System.out.println("Goodbye!");
        System.exit(0);
    }

    public static String GUIRPSRules(){
        return  """
                In Rock, Paper, Scissors! You will play a best of 3 against an AI by
                playing Rock, Paper, or Scissors.
                
                The winner of the round is determined by these rules:
                
                1.) Rock beats Scissors.
                2.) Scissors beats Paper.
                3.) Paper beats Rock.""";
    }
}

