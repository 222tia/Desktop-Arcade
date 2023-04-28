package edu.bsu.cs222;

import edu.bsu.cs222.Bunco.BuncoDialogue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class BuncoDialogueTest {

    String expectedOutput;
    String methodOutput;
    int score;
    int playerNumber;
    int playerScore;
    int compScore;
    int player2Score;
    int round;
    int turnOrder;
    boolean Continue;

    @Test
    void testDiceOutput() {
        List<Integer> diceRollList = List.of(1, 2, 3);
        expectedOutput = "\nRoll 1 = 1\nRoll 2 = 2\nRoll 3 = 3";
        methodOutput = BuncoDialogue.DiceOutput(diceRollList);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void testPlayerScoreDisplaySingle() {
        score = 10;
        playerNumber = 1;
        expectedOutput = "Your score is 10";
        methodOutput = BuncoDialogue.PlayerScoreDisplay(score, playerNumber);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }
    @Test
    void testPlayerScoreDisplayMulti() {
        score = 10;
        playerNumber = 2;
        expectedOutput = "Player 1's score is 10";
        methodOutput = BuncoDialogue.PlayerScoreDisplay(score, playerNumber);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void testCompScoreDisplay() {
        score = 10;
        expectedOutput = "Your opponent's score is 10";
        methodOutput = BuncoDialogue.CompScoreDisplay(score);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void testScoreDisplay() {
        playerScore = 10;
        compScore = 5;
        expectedOutput = "Your score is 10. Your opponent's score is 5.";
        methodOutput = BuncoDialogue.ScoreDisplay(playerScore, compScore);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void testPlayerWinDisplay() {
        expectedOutput = "\n\nBunco! You Win!";
        methodOutput = BuncoDialogue.PlayerWinDisplay();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void testCompWinDisplay() {
        expectedOutput = "\n\nYou Lose! Better luck next time!";
        methodOutput = BuncoDialogue.CompWinDisplay();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void testRestartDisplay() {
        expectedOutput = "\nPlease restart the game";
        methodOutput = BuncoDialogue.RestartDisplay();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void testRoundDisplay() {
        round = 5;
        expectedOutput = "\n\nRound #5";
        methodOutput = BuncoDialogue.RoundDisplay(round);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void testGUIBuncoRules() {
        expectedOutput = """
                Bunco is played by rolling 3 dice.
                Rounds are numbered from 1 to 6 before looping back to 1.
                When you gain points you get to roll again! When no points are gained play passes and your turn is over.
                Click the Button to continue play.
                
                1 point is gained when a dice roll is equal to the round number.
                5 points are gained when triples are rolled.
                If the triples match the round number, you automatically win!!
                
                Otherwise, the winner is the first to get to 21 points!""";
        methodOutput = BuncoDialogue.GUIBuncoRules();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void testGUIBuncoMultiplayerRules() {
        expectedOutput = """
                Bunco is played by rolling 3 dice.
                Rounds are numbered from 1 to 6 before looping back to 1.
                When you gain points you get to roll again! When no points are gained play passes and your turn is over.
                
                Keep and eye on the dialogue box below!
                It will alert you when the next player's turn is; that is when the previous player passes the controls over to them!
                Click the Button to continue play.
                
                1 point is gained when a dice roll is equal to the round number.
                5 points are gained when triples are rolled.
                If the triples match the round number, you automatically win!!
                
                Otherwise, the winner is the first to get to 21 points!""";
        methodOutput = BuncoDialogue.GUIBuncoMultiplayerRules();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void testPlayer1WinDisplay() {
        expectedOutput = "\n\nBunco! Player 1 Wins!";
        methodOutput = BuncoDialogue.Player1WinDisplay();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void testPlayer2ScoreDisplay() {
        score = 10;
        expectedOutput = "Player 2's score is 10";
        methodOutput = BuncoDialogue.Player2ScoreDisplay(score);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void testPlayer2WinDisplay() {
        expectedOutput = "\n\nBunco! Player 2 Wins!";
        methodOutput = BuncoDialogue.Player2WinDisplay();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void testMultiScoreDisplay() {
        playerScore = 10;
        player2Score = 5;
        expectedOutput = "Player 1's score is 10. Player 2's score is 5.";
        methodOutput = BuncoDialogue.MultiScoreDisplay(playerScore,player2Score);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void testTurnDisplayTurnOrder1() {
        turnOrder = 1;
        expectedOutput = "It's Your Turn!";
        methodOutput = BuncoDialogue.TurnDisplay(turnOrder);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void testTurnDisplayTurnOrder2() {
        turnOrder = 2;
        expectedOutput = "It's Your Opponent's Turn!";
        methodOutput = BuncoDialogue.TurnDisplay(turnOrder);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void testMultiTurnDisplayTurnOrder1() {
        turnOrder = 1;
        expectedOutput = "It's Player 1's Turn!";
        methodOutput = BuncoDialogue.MultiTurnDisplay(turnOrder);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void testMultiTurnDisplayTurnOrder2() {
        turnOrder = 2;
        expectedOutput = "It's Player 2's Turn!";
        methodOutput = BuncoDialogue.MultiTurnDisplay(turnOrder);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void testMultiplayerCheckTurn() {
        playerNumber = 1;
        turnOrder = 1;
        expectedOutput = "It's Your Turn!";
        methodOutput = BuncoDialogue.MultiplayerCheckTurn(playerNumber,turnOrder);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }
/*
    @Test
    void testContinueCheck() {
        expectedOutput = ;
        methodOutput = ;
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void testMultiContinueCheck() {
        expectedOutput = ;
        methodOutput = ;
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void testWinCondition() {
        expectedOutput = ;
        methodOutput = ;
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void testMultiWinCondition() {
        expectedOutput = ;
        methodOutput = ;
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    void testPlayer1Win() {
        expectedOutput = ;
        methodOutput = ;
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

 */
}