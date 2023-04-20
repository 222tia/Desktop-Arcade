package edu.bsu.cs222.Bunco;

import java.util.List;

@SuppressWarnings("SameReturnValue")
public class BuncoDialogue {
    public static String DiceOutput(List<Integer> diceRollList) {
        return ("\nRoll 1 = " + diceRollList.get(0) + "\nRoll 2 = " + diceRollList.get(1) + "\nRoll 3 = " + diceRollList.get(2));
    }

    public static String PlayerScoreDisplay (int score){return ("Your score is " + score);}

    public static String CompScoreDisplay (int score){
        return ("Your opponent's score is " + score);
    }

    public static String ScoreDisplay(int playerScore, int compScore){
        return("Your score is "+playerScore+". Your opponent's score is "+compScore+".");
    }

    public static String PlayerContinueDisplay(){
        return("\n\nYou gained points, so you get to roll again!");
    }
    public static String CompContinueDisplay(){return("\n\nYour opponent gained points, and gets to roll again!");}

    public static String PlayerWinDisplay(){
        return("\n\nBunco! You Win!");
    }
    public static String CompWinDisplay(){
        return("\n\nYou Lose! Better luck next time!");
    }

    public static String CompTurnDisplay() {return("It's Your Opponent's Turn!"); }
    public static String PlayerTurnDisplay(){return ("It's Your Turn!");}

    public static String RestartDisplay() {return("\nPlease restart the game");}

    public static String RoundDisplay(int round){
        return("\nRound #" + round);
    }

    public static String GUIBuncoRules(){
        return """
                Bunco is played by rolling 3 dice.
                Rounds are numbered from 1 to 6 before looping back to 1.
                When you gain points you get to roll again! When no points are gained play passes and your turn is over.
                Click the Button to continue play.
                
                1 point is gained when a dice roll is equal to the round number.
                5 points are gained when triples are rolled.
                If the triples match the round number, you automatically win!!
                
                Otherwise, the winner is the first to get to 21 points!""";
    }

    public static String Player1ScoreDisplay(int score) {
        return ("Player 1's score is " + score);
    }

    public static String Player1WinDisplay(){
        return("\n\nBunco! Player 1 Wins!");
    }

    public static String Player2ScoreDisplay(int score) {
        return ("Player 2's score is " + score);
    }

    public static String Player2WinDisplay(){
        return("\n\nBunco! Player 2 Wins!");
    }

    public static String Player1TurnDisplay(){return ("It's Player 1's Turn!");}

    public static String Player2TurnDisplay(){return ("It's Player 2's Turn!");}

    public static String playerScoreDisplays(int playerScore, int player2Score){
        return("Player 1's score is "+playerScore+". Player 2's score is "+player2Score+".");
    }

    public static String Player1ContinueDisplay(){
        return("\n\nPlayer 1 gained points, and gets to roll again!");
    }

    public static String Player2ContinueDisplay(){
        return("\n\nPlayer 2 gained points, and gets to roll again!");
    }
}
