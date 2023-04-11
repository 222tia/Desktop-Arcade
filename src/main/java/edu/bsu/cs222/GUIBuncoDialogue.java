package edu.bsu.cs222;

public class GUIBuncoDialogue {
    public static String RollOutput(int dice1, int dice2, int dice3) {
        return ("\nRoll 1 = " + dice1 + "\nRoll 2 = " + dice2 + "\nRoll 3 = " + dice3);
    }

    public static String GUIRoundDisplay(int round){
        return("\nRound #" + round);
    }

    public static String PlayerTurnDisplay(){
        return("It's Your Turn!");
    }

    public static String ScoreDisplay(int playerScore, int compScore){
        return("Your score is "+playerScore+". Your opponent's score is "+compScore+".");
    }

    public static String PlayerContinueDisplay(){
        return("\n\nYou gained points, so you get to roll again!");
    }
    public static String CompContinueDisplay(){return("\n\nYour opponent gained points, and get to roll again!");}

    public static String PlayerWinDisplay(){
        return("\n\nBunco! You Win!");
    }
    public static String CompWinDisplay(){
        return("\n\nYou Lose! Better luck next time!");
    }

    public static String CompTurnDisplay() {return("It's Your Opponent's Turn!"); }

    public static String RestartDisplay() {return("Please restart the game");}
}
