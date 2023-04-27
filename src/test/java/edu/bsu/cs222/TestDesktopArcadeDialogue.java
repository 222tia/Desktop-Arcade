package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDesktopArcadeDialogue {
    String expectedOutput;
    String methodOutput;
    @Test
    public void testStartUpDialogue() {
        expectedOutput = """
                Welcome to Desktop Arcade
                To play, please enter the number of the corresponding game:
                1.) Rock Paper Scissors!
                2.) Bunco!
                3.) Tic Tac Toe!
                
                To exit the program, press 'x'""";
        methodOutput = DesktopArcadeDialogue.startUpDialogue();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testRPSRules() {
        expectedOutput = """
                
                In Rock, Paper, Scissors! You will play a best of 3 against an AI by
                playing Rock, Paper, or Scissors.
                
                The winner of the round is determined by these rules:
                
                1.) Rock beats Scissors.
                2.) Scissors beats Paper.
                3.) Paper beats Rock.
                """;
        methodOutput = DesktopArcadeDialogue.RPSRules();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testBuncoRules() {
        expectedOutput = """
                
                Bunco is played by rolling 3 dice.
                Rounds are numbered from 1 to 6 before looping back to 1.
                When you gain points you get to roll again! When no points are gained play passes and your turn is over.
                Hit enter to continue play.
                
                1 point is gained when a dice roll is equal to the round number.
                5 points are gained when triples are rolled.
                If the triples match the round number, you automatically win!!
                
                Otherwise, the winner is the first to get to 21 points!""";
        methodOutput = DesktopArcadeDialogue.BuncoRules();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testBuncoMultiplayerRules() {
        expectedOutput = """
                
                Bunco is played by rolling 3 dice.
                Rounds are numbered from 1 to 6 before looping back to 1.
                When you gain points you get to roll again! When no points are gained play passes and your turn is over.
                Hit enter to continue play.
                
                Keep and eye on the dialogue!
                It will alert you when the next player's turn is; that is when the previous player passes the controls over to them!
                Hit enter to continue play.
                
                1 point is gained when a dice roll is equal to the round number.
                5 points are gained when triples are rolled.
                If the triples match the round number, you automatically win!!
                
                Otherwise, the winner is the first to get to 21 points!""";
        methodOutput = DesktopArcadeDialogue.BuncoMultiplayerRules();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testTTTRules() {
        expectedOutput = """
                
                Tic-Tac-Toe is played by using a 3x3 grid.
                Players take turns to select a spot in the grid to put an X or an O.
                If a player gets 3 in a row vertically, horizontally, or diagonally they win!
                Press enter to continue play.
                """;
        methodOutput = DesktopArcadeDialogue.TTTRules();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testTTTMultiplayerRules() {
        expectedOutput = """
                
                Tic-Tac-Toe is played by using a 3x3 grid.
                
                Player 1 will select their letter and press enter, while player 2 will be assigned the opposite to player 1's choice.
                Player 1 will then begin the game by selecting a spot to put an X or an O, depending on what letter they chose.
                Then, players will take turns passing the controls over to one another on their respective turns!
                
                If a player gets 3 in a row vertically, horizontally, or diagonally they win!
                Press enter to continue play.
                """;
        methodOutput = DesktopArcadeDialogue.TTTMultiplayerRules();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testMultiplayerSelect() {
        expectedOutput = """
                Would you like to play Singleplayer or Multiplayer?
                
                Enter '1' to play by yourself!
                Enter '2' to play with a friend!
                """;
        methodOutput = DesktopArcadeDialogue.multiplayerSelect();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

}
