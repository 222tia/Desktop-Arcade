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

            boolean pointGain = false;
            boolean dice1PointGain = (dice1Value == roundNumber);
            boolean dice2PointGain = (dice2Value == roundNumber);
            boolean dice3PointGain = (dice3Value == roundNumber);
            if (dice1PointGain) compScore = compScore + 1;
            if (dice2PointGain) compScore = compScore + 1;
            if (dice3PointGain) compScore = compScore + 1;
            if (dice1PointGain || dice2PointGain || dice3PointGain){
                pointGain = true;
            }
            boolean DiceTriples = false;
            if ((dice1Value == dice2Value) && (dice2Value == dice3Value)) {
                DiceTriples = true;
                compScore = compScore + 5;
                if (dice1PointGain) {
                    compScore = compScore + 21;
                }
            }
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
