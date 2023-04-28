package edu.bsu.cs222;

import edu.bsu.cs222.Bunco.BuncoDialogue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TestBuncoDialogue {

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
    int players;

    @Test
    public void testDiceOutput() {
        List<Integer> diceRollList = List.of(1, 2, 3);
        expectedOutput = "\nRoll 1 = 1\nRoll 2 = 2\nRoll 3 = 3";
        methodOutput = BuncoDialogue.diceOutput(diceRollList);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testPlayerScoreDisplaySingle() {
        score = 10;
        playerNumber = 1;
        expectedOutput = "Your score is 10";
        methodOutput = BuncoDialogue.playerScoreDisplay(score, playerNumber);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }
    @Test
    public void testPlayerScoreDisplayMulti() {
        score = 10;
        playerNumber = 2;
        expectedOutput = "Player 1's score is 10";
        methodOutput = BuncoDialogue.playerScoreDisplay(score, playerNumber);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testCompScoreDisplay() {
        score = 10;
        expectedOutput = "Your opponent's score is 10";
        methodOutput = BuncoDialogue.compScoreDisplay(score);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testScoreDisplay() {
        playerScore = 10;
        compScore = 5;
        expectedOutput = "Your score is 10. Your opponent's score is 5.";
        methodOutput = BuncoDialogue.ScoreDisplay(playerScore, compScore);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testPlayerWinDisplay() {
        expectedOutput = "\n\nBunco! You Win!";
        methodOutput = BuncoDialogue.playerWinDisplay();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testCompWinDisplay() {
        expectedOutput = "\n\nYou Lose! Better luck next time!";
        methodOutput = BuncoDialogue.compWinDisplay();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testRestartDisplay() {
        expectedOutput = "\nPlease restart the game";
        methodOutput = BuncoDialogue.restartDisplay();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testRoundDisplay() {
        round = 5;
        expectedOutput = "\n\nRound #5";
        methodOutput = BuncoDialogue.roundDisplay(round);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testGUIBuncoRules() {
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
    public void testGUIBuncoMultiplayerRules() {
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
    public void testPlayer1WinDisplay() {
        expectedOutput = "\n\nBunco! Player 1 Wins!";
        methodOutput = BuncoDialogue.player1WinDisplay();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testPlayer2ScoreDisplay() {
        score = 10;
        expectedOutput = "Player 2's score is 10";
        methodOutput = BuncoDialogue.player2ScoreDisplay(score);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testPlayer2WinDisplay() {
        expectedOutput = "\n\nBunco! Player 2 Wins!";
        methodOutput = BuncoDialogue.player2WinDisplay();
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testMultiScoreDisplay() {
        playerScore = 10;
        player2Score = 5;
        expectedOutput = "Player 1's score is 10. Player 2's score is 5.";
        methodOutput = BuncoDialogue.multiScoreDisplay(playerScore,player2Score);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testTurnDisplayTurnOrder1() {
        turnOrder = 1;
        expectedOutput = "It's Your Turn!";
        methodOutput = BuncoDialogue.singleTurnDisplay(turnOrder);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testTurnDisplayTurnOrder2() {
        turnOrder = 2;
        expectedOutput = "It's Your Opponent's Turn!";
        methodOutput = BuncoDialogue.singleTurnDisplay(turnOrder);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testMultiTurnDisplayTurnOrder1() {
        turnOrder = 1;
        expectedOutput = "It's Player 1's Turn!";
        methodOutput = BuncoDialogue.multiTurnDisplay(turnOrder);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testMultiTurnDisplayTurnOrder2() {
        turnOrder = 2;
        expectedOutput = "It's Player 2's Turn!";
        methodOutput = BuncoDialogue.multiTurnDisplay(turnOrder);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testMultiplayerCheckTurn() {
        playerNumber = 1;
        turnOrder = 1;
        expectedOutput = "It's Your Turn!";
        methodOutput = BuncoDialogue.multiplayerCheckTurn(playerNumber,turnOrder);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testContinueCheckTurnOrder1() {
        Continue = true;
        turnOrder = 1;
        score = 10;
        expectedOutput = "\n\nYou gained points, and get to roll again!";
        methodOutput = BuncoDialogue.continueCheck(Continue, turnOrder, score);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testContinueCheckTurnOrder2() {
        Continue = true;
        turnOrder = 2;
        score = 10;
        expectedOutput = "\n\nYour opponent gained points, and gets to roll again!";
        methodOutput = BuncoDialogue.continueCheck(Continue, turnOrder, score);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testContinueCheckNull() {
        Continue = false;
        turnOrder = 2;
        score = 21;
        expectedOutput = " ";
        methodOutput = BuncoDialogue.continueCheck(Continue, turnOrder, score);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testMultiContinueCheckTurnOder1() {
        Continue = true;
        turnOrder = 1;
        score = 10;
        expectedOutput = "\n\nPlayer 1 gained points, and gets to roll again!";
        methodOutput = BuncoDialogue.multiContinueCheck(Continue, turnOrder, score);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testMultiContinueCheckTurnOder2() {
        Continue = true;
        turnOrder = 2;
        score = 10;
        expectedOutput = "\n\nPlayer 2 gained points, and gets to roll again!";
        methodOutput = BuncoDialogue.multiContinueCheck(Continue, turnOrder, score);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testMultiContinueCheckNull() {
        Continue = false;
        turnOrder = 1;
        score = 21;
        expectedOutput = " ";
        methodOutput = BuncoDialogue.multiContinueCheck(Continue, turnOrder, score);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testSingleWinConditionWin() {
        turnOrder = 1;
        score = 21;
        expectedOutput = "\n\nBunco! You Win!";
        methodOutput = BuncoDialogue.singleWinCondition(score, turnOrder);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testSingleWinConditionLose() {
        turnOrder = 2;
        score = 21;
        expectedOutput = "\n\nYou Lose! Better luck next time!";
        methodOutput = BuncoDialogue.singleWinCondition(score, turnOrder);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testSingleWinConditionNull() {
        turnOrder = 1;
        score = 10;
        expectedOutput = " ";
        methodOutput = BuncoDialogue.singleWinCondition(score, turnOrder);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testMultiWinConditionPlayer1Win() {
        turnOrder = 1;
        score = 21;
        expectedOutput = "\n\nBunco! Player 1 Wins!";
        methodOutput = BuncoDialogue.multiWinCondition(score, turnOrder);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testMultiWinConditionPlayer2Win() {
        turnOrder = 2;
        score = 21;
        expectedOutput = "\n\nBunco! Player 2 Wins!";
        methodOutput = BuncoDialogue.multiWinCondition(score, turnOrder);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testMultiWinConditionNull() {
        turnOrder = 1;
        score = 10;
        expectedOutput = " ";
        methodOutput = BuncoDialogue.multiWinCondition(score, turnOrder);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void testPlayer1Win() {
        players = 1;
        expectedOutput = "\n\nBunco! You Win!";
        methodOutput = BuncoDialogue.player1Win(players);
        Assertions.assertEquals(expectedOutput, methodOutput);
    }


}