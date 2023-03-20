package edu.bsu.cs222.finalproject;


import java.io.IOException;
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
        score = DiceScoring(score, roundNumber, dice1);
        score = DiceScoring(score, roundNumber, dice2);
        score = DiceScoring(score, roundNumber, dice3);
        if ((dice1 == dice2) && (dice2 == dice3)) {
            score = score + 5;
            if (dice1==roundNumber) {
                score = score + 13;
            }
        }
        return score;
    }

    public static Integer DiceScoring(int score, int round, int diceValue){
        if(diceValue==round){
            score=score+1;
        }
        return score;
    }

    public static void EnterContinue() throws IOException {
        System.in.read();
    }

}
