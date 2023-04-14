package edu.bsu.cs222;

public class BuncoDialogue {
    public static String DiceOutput(int dice1, int dice2, int dice3) {
        return ("\nRoll 1 = " + dice1 + "\nRoll 2 = " + dice2 + "\nRoll 3 = " + dice3);
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
    public static String CompContinueDisplay(){return("\n\nYour opponent gained points, and get to roll again!");}

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
}
