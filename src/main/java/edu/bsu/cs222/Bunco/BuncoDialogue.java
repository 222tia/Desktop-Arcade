package edu.bsu.cs222.Bunco;

import java.util.List;

@SuppressWarnings("SameReturnValue")
public class BuncoDialogue {
    public static String diceOutput(List<Integer> diceRollList) {
        return ("\nRoll 1 = " + diceRollList.get(0) + "\nRoll 2 = " + diceRollList.get(1) + "\nRoll 3 = " + diceRollList.get(2));
    }

    public static String playerScoreDisplay(int score, int playerNumber){
        if (playerNumber==1) {
            return ("Your score is " + score);
        }else{
            return ("Player 1's score is " + score);
    }}

    public static String compScoreDisplay(int score){
        return ("Your opponent's score is " + score);
    }

    public static String ScoreDisplay(int playerScore, int compScore){
        return("Your score is "+playerScore+". Your opponent's score is "+compScore+".");
    }

    public static String playerWinDisplay(){
        return("\n\nBunco! You Win!");
    }
    public static String compWinDisplay(){
        return("\n\nYou Lose! Better luck next time!");
    }

    public static String restartDisplay() {return("\nPlease restart the game");}

    public static String roundDisplay(int round){
        return("\n\nRound #" + round);
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

    public static String GUIBuncoMultiplayerRules(){
        return """
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
    }


    public static String player1WinDisplay(){
        return("\n\nBunco! Player 1 Wins!");
    }

    public static String player2ScoreDisplay(int score) {
        return ("Player 2's score is " + score);
    }

    public static String player2WinDisplay(){
        return("\n\nBunco! Player 2 Wins!");
    }

    public static String multiScoreDisplay(int playerScore, int player2Score){
        return("Player 1's score is "+playerScore+". Player 2's score is "+player2Score+".");
    }

    public static String singleTurnDisplay(int turnOrder) {
        if (turnOrder == 1) {
            return ("It's Your Turn!");
        } else {
            return ("It's Your Opponent's Turn!");
        }
    }

    public static String multiTurnDisplay(int turnOrder) {
        if (turnOrder == 1) {
            return ("It's Player 1's Turn!");
        }else {
            return ("It's Player 2's Turn!");
        }
    }

    public static String multiplayerCheckTurn(int playerNumber, int turnOrder){
        if (playerNumber==1){
            return (singleTurnDisplay(turnOrder));
        }else{
            return (multiTurnDisplay(turnOrder));
        }
    }

    public static String continueCheck(boolean Continue, int turnOrder, int score){
        if ((Continue) && (score < 21)) {
            if (turnOrder==1) {
                return ("\n\nYou gained points, and get to roll again!");
            }else{
                return ("\n\nYour opponent gained points, and gets to roll again!");
            }
        }
        return " ";
    }

    public static String multiContinueCheck(boolean Continue, int turnOrder, int score){
        if ((Continue) && (score < 21)) {
            if (turnOrder==1) {
                return ("\n\nPlayer 1 gained points, and gets to roll again!");
            }else{
                return ("\n\nPlayer 2 gained points, and gets to roll again!");
            }
        }
        return " ";
    }

    public static String singleWinCondition(int score, int turnOrder){
        if (score>=21){
            if(turnOrder==1){
                return("\n\nBunco! You Win!");
            }else{
                return("\n\nYou Lose! Better luck next time!");
            }
        }
        return " ";
    }

    public static String multiWinCondition(int score, int turnOrder){
        if (score>=21){
            if(turnOrder==1){
                return("\n\nBunco! Player 1 Wins!");
            }else{
                return("\n\nBunco! Player 2 Wins!");
            }
        }
        return " ";
    }

    public static String player1Win(int players){
        if (players==1) {
            return(BuncoDialogue.playerWinDisplay());
        }else{
            return(BuncoDialogue.player1WinDisplay());
        }
    }
}
