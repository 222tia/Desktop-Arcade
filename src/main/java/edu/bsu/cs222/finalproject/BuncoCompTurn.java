package edu.bsu.cs222.finalproject;

import java.io.IOException;

public class BuncoCompTurn {
    public static Integer CompTurn(int compScore, int roundNumber) throws IOException {
        boolean turnContinue;
        System.out.println("Computer Turn!");
        do {
            System.out.println("\nRound #" + roundNumber);
            int dice1Value = BuncoClasses.DiceRoll();
            int dice2Value = BuncoClasses.DiceRoll();
            int dice3Value = BuncoClasses.DiceRoll();
            System.out.println("Roll 1 = " + dice1Value);
            System.out.println("Roll 2 = " + dice2Value);
            System.out.println("Roll 3 = " + dice3Value);


            boolean pointGain = ((dice1Value== roundNumber) || (dice2Value== roundNumber) || (dice3Value == roundNumber));
            boolean DiceTriples = (dice1Value == dice2Value) && (dice2Value == dice3Value);
            compScore = BuncoClasses.Scoring(compScore, roundNumber, dice1Value, dice2Value, dice3Value);
            turnContinue = pointGain || DiceTriples;
            System.out.println("Your opponent's score is " + compScore);

            if (compScore >= 21) {
                System.out.println("Bunco! You lose!");
                System.exit(0);
            }

            int mykey = System.in.read();


        } while (turnContinue);
        return compScore;
    }
}
