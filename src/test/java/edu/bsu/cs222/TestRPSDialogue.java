package edu.bsu.cs222;

import edu.bsu.cs222.RPS.RPSDialogue;
import edu.bsu.cs222.RPS.RPSResultDecider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestRPSDialogue extends RPSResultDecider {

    String expectedOutput;
    String methodOutput;
    String userPlay;
    String computerPlay;
    int userScore;
    int computerScore;
    int roundNumber;

    @Test
    public void testShowRoundResultCompScores() {
        userPlay = "paper";
        computerPlay = "scissors";
        expectedOutput = "Computer played scissors, computer score + 1";
        methodOutput = RPSDialogue.showRoundResult(userPlay,computerPlay);
        Assertions.assertEquals(expectedOutput,methodOutput);

    }

    @Test
    public void testShowRoundResultUserScores() {
        userPlay = "scissors";
        computerPlay = "paper";
        expectedOutput = "Computer played paper, your score + 1";
        methodOutput = RPSDialogue.showRoundResult(userPlay,computerPlay);
        Assertions.assertEquals(expectedOutput,methodOutput);
    }

    @Test
    public void testShowRoundResultTie() {
        userPlay = "rock";
        computerPlay = "rock";
        expectedOutput = "Computer played rock, tie. no score added.";
        methodOutput = RPSDialogue.showRoundResult(userPlay,computerPlay);
        Assertions.assertEquals(expectedOutput,methodOutput);
    }

    @Test
    public void testShowGameResultUserWin() {
        userScore = 2;
        computerScore = 0;
        expectedOutput = "\n\nGame over, you won!";
        methodOutput = RPSDialogue.showGameResult(userScore, computerScore);
        Assertions.assertEquals(expectedOutput,methodOutput);
    }

    @Test
    public void testShowGameResultCompWin() {
        userScore = 0;
        computerScore = 2;
        expectedOutput = "\n\nGame over, you lost!";
        methodOutput = RPSDialogue.showGameResult(userScore, computerScore);
        Assertions.assertEquals(expectedOutput,methodOutput);
    }

    @Test
    public void testShowGameResultNull() {
        userScore = 1;
        computerScore = 0;
        expectedOutput = "";
        methodOutput = RPSDialogue.showGameResult(userScore, computerScore);
        Assertions.assertEquals(expectedOutput,methodOutput);
    }

    @Test
    public void testInputPrompt() {
        expectedOutput = "\nRock, Paper, or Scissors?: ";
        methodOutput = RPSDialogue.inputPrompt();
        Assertions.assertEquals(expectedOutput,methodOutput);
    }

    @Test
    public void testShowScore() {
        userScore = 1;
        computerScore = 1;
        expectedOutput = "\nYour score is: 1\nComputer score is: 1";
        methodOutput = RPSDialogue.showScore(userScore,computerScore);
        Assertions.assertEquals(expectedOutput,methodOutput);
    }

    @Test
    public void testShowRoundNumber() {
        roundNumber = 3;
        expectedOutput = "\n\n/// Round 3 ///";
        methodOutput = RPSDialogue.showRoundNumber(roundNumber);
        Assertions.assertEquals(expectedOutput,methodOutput);
    }

    @Test
    public void testRestartDisplay() {
        expectedOutput = "\n\nPlease restart the game";
        methodOutput = RPSDialogue.RestartDisplay();
        Assertions.assertEquals(expectedOutput,methodOutput);
    }
}