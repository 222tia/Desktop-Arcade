package edu.bsu.cs222.finalproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PlayRandomizerRPS {

    private static final ArrayList<String> possiblePlays = new ArrayList<>(
            Arrays.asList("rock", "paper", "scissors"));
    private static int randomPlay = 0;
    public static String getRandomPlay() {
        Random random_method = new Random();
        for (int play = 0; play < possiblePlays.size(); play++) {
            randomPlay = random_method.nextInt(possiblePlays.size());
        }
        return possiblePlays.get(randomPlay);
    }
}
