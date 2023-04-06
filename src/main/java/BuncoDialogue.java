public class BuncoDialogue {
    public static void DiceOutput(int dice1, int dice2, int dice3){
        System.out.println("Roll 1 = " + dice1 +
                "\nRoll 2 = " + dice2 +
                "\nRoll 3 = " + dice3 );
    }

    public static void PlayerScoreDisplay (int score){
        System.out.println("Your score is " + score);
    }

    public static void CompScoreDisplay (int score){
        System.out.println("Your opponent's score is " + score);
    }

    public static void PlayerWinDisplay(){
        System.out.println("Bunco! You win!");
        System.exit(0);
    }

    public static void CompWinDisplay(){
        System.out.println("Computer wins! Better luck next time!");
        System.exit(0);
    }

    public static void PlayerTurnDisplay(){
        System.out.println("\nIt's Your Turn!");
    }

    public static void CompTurnDisplay(){
        System.out.println("\nComputer Turn!");
    }

    public static void RoundDisplay(int round){
        System.out.println("\nRound #" + round);
    }
}
