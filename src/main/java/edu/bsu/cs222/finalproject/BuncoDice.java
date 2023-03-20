package edu.bsu.cs222.finalproject;


import java.util.ArrayList;
import java.util.List;

public class BuncoDice {
    public final static List<Integer> diceRollList = new ArrayList<>();

    public static Integer DiceRoll(){
        return (int) (Math.random() * 6) + 1;
    }

    public static List<Integer> getDiceRolls() {
        for (int i = 0; i < 3; i++) {
            diceRollList.add(DiceRoll());
        }
        return diceRollList;
    }

    public static Integer Scoring(int score, int roundNumber, int dice1, int dice2, int dice3){
        boolean dice1PointGain = (dice1 == roundNumber);
        boolean dice2PointGain = (dice2 == roundNumber);
        boolean dice3PointGain = (dice3 == roundNumber);
        if (dice1PointGain) score = score + 1;
        if (dice2PointGain) score = score + 1;
        if (dice3PointGain) score = score + 1;
        if ((dice1 == dice2) && (dice2 == dice3)) {
            score = score + 5;
            if (dice1PointGain) {
                score = score + 13;
            }
        }
        return score;
    }

}
