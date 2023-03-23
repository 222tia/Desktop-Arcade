package singlePlayerBunco;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ResultOfMethodCallIgnored")
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

    public static Integer Scoring(int score, int roundNumber, List<Integer> diceRollList){

        int dice1 = diceRollList.get(0);
        int dice2 = diceRollList.get(1);
        int dice3 = diceRollList.get(2);

        for (int i = 0; i < 3; i++) {
            score = DiceScoring(score, roundNumber, diceRollList.get(i));
        }
        if ((dice1 == dice2) && (dice2 == dice3)) {
            score = score + 5;
            if (dice1==roundNumber) {
                score = score + 13;
            }
        }
        return score;
    }

    public static Integer DiceScoring(int score, int round, int diceValue) {
        if (diceValue == round) {
            score = score + 1;
        }
        return score;
    }

    public static void EnterContinue() throws IOException {
        System.in.read();
    }

}
