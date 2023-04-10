package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestRPSPlayRandomizer {
    private static final ArrayList<String> possiblePlays = new ArrayList<>(
            Arrays.asList("rock", "paper", "scissors"));

    @Test
    public void testPlayRandomizerOutput(){
        final String randomResult = RPSPlayRandomizer.getRandomPlay();
        Assertions.assertTrue(possiblePlays.contains(randomResult));
    }
}

