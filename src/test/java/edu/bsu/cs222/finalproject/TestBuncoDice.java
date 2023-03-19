package edu.bsu.cs222.finalproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBuncoDice {
    @Test
    public void testDiceRollOutput(){
        final int randomDiceRoll = BuncoDice.DiceRoll();
        Assertions.assertTrue(randomDiceRoll <= 6);
    }
}
