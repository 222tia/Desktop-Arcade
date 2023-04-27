package edu.bsu.cs222;

import edu.bsu.cs222.TTT.TTTDialogue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestTTTDialogue {

    public String expectedOutput;
    public String methodOutput;
    int playerNumber;
    boolean playerWin;
    boolean draw;
    String player;

    @Test
    public void testShowGameboard() {
        ArrayList<String> gameBoard = new ArrayList<>(
                Arrays.asList("X"," "," ","O","X"," "," ","O"," "));
        expectedOutput = """
                              X |   | \s
                             ------------
                              O | X | \s
                             ------------
                                | O |  \
                """;
        methodOutput = TTTDialogue.showGameBoard(gameBoard);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testSinglePlayerInputInstructions() {
        playerNumber = 1;
        expectedOutput = "\n       it's your turn!" +
                """
                  
                              1 | 2 | 3
                             ------------
                              4 | 5 | 6
                             ------------
                              7 | 8 | 9
                  Type the number of your chosen space.
                """;
        methodOutput = TTTDialogue.inputInstructions(playerNumber, "Player 1");
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testMultiPlayerInputInstructions() {
        playerNumber = 2;
        expectedOutput = "\n       " + "Player 2" + ", it's your turn!" +
                """
                  
                              1 | 2 | 3
                             ------------
                              4 | 5 | 6
                             ------------
                              7 | 8 | 9
                  Type the number of your chosen space.
                """;
        methodOutput = TTTDialogue.inputInstructions(playerNumber, "Player 2");
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testCompTurn() {
        expectedOutput = "it's the Computer's turn!";
        methodOutput = TTTDialogue.compTurn();
    }

    @Test
    public void testImproperSpace() {
        expectedOutput = "\nThat space is not empty";
        methodOutput = TTTDialogue.improperSpace();
    }

    @Test
    public void testInvalidUserInput() {
        expectedOutput = "\nInvalid input (enter a number 1-9).";
        methodOutput = TTTDialogue.invalidUserInput();
    }

    @Test
    public void testEndDialogue() {
        expectedOutput = "The game is over. Please restart.";
        methodOutput = TTTDialogue.endDialogue();
    }

    @Test
    public void letterChoiceDialogueSingle() {
        playerNumber = 1;
        expectedOutput = "Do you want to play as Xs or Os?";
        methodOutput = TTTDialogue.letterChoiceDialogue(playerNumber);
    }

    @Test
    public void letterChoiceDialogueMulti() {
        playerNumber = 2;
        expectedOutput = "Do you want to play as Xs or Os?";
        methodOutput = TTTDialogue.letterChoiceDialogue(playerNumber);
    }

    @Test
    public void showMultiplayerLetterChoice() {
        String userOneLetter = "O";
        String userTwoLetter = "X";
        expectedOutput = "\nPlayer 1, you will play as O\nPlayer 2, you will play as X";
        methodOutput = TTTDialogue.showMultiplayerLetterChoice(userOneLetter, userTwoLetter);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testInvalidLetterInput() {
        expectedOutput = "Invalid input. Do you want to play as Xs or Os?";
        methodOutput = TTTDialogue.invalidLetterChoice();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testGameOutcomeDialogueDraw() {
        playerWin = false;
        draw = true;
        player = "Player 1";
        expectedOutput = "\n\n\nThe game ends in a draw.";
        methodOutput = TTTDialogue.gameOutcomeDialogue(draw, playerWin, player);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testGameOutcomeDialoguePlayer1Win() {
        playerWin = true;
        draw = false;
        player = "Player 1";
        expectedOutput = "\n\n\nThe winner is Player 1!";
        methodOutput = TTTDialogue.gameOutcomeDialogue(draw, playerWin, player);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testGameOutcomeDialogueNull() {
        playerWin = false;
        draw = false;
        player = "Player 1";
        expectedOutput = "";
        methodOutput = TTTDialogue.gameOutcomeDialogue(draw, playerWin, player);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testGUITTTRules() {
        expectedOutput = """
                Tic-Tac-Toe is played by using a 3x3 grid.
                Players take turns to select a spot in the grid to put an X or an O.
                If a player gets 3 in a row vertically, horizontally, or diagonally they win!
                Enter a number 1-9 to choose your space.
                
                                             1 | 2 | 3
                                           ------------
                                             4 | 5 | 6
                                           ------------
                                             7 | 8 | 9""";
        methodOutput = TTTDialogue.GUITTTRules();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testGUITTTMultiplayerRules() {
        expectedOutput = """
                Tic-Tac-Toe is played by using a 3x3 grid.
                
                Player 1 will select their letter in the drop-down box, while player 2 will be assigned the opposite to player 1's choice.
                Player 1 will then begin the game by selecting a spot to put an X or an O, depending on what letter they chose.
                Then, players will take turns passing the controls over to one another on their respective turns!
                
                If a player gets 3 in a row vertically, horizontally, or diagonally they win!
                Enter a number 1-9 to choose your space.
                
                                             1 | 2 | 3
                                           ------------
                                             4 | 5 | 6
                                           ------------
                                             7 | 8 | 9""";
        methodOutput = TTTDialogue.GUITTTMultiplayerRules();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testPlayer1Turn() {
        expectedOutput = "Player 1, enter your selection and hit enter";
        methodOutput = TTTDialogue.player1Turn();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testPlayer2turn() {
        expectedOutput = "Player 2, enter your selection and hit enter";
        methodOutput = TTTDialogue.player2Turn();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

}
