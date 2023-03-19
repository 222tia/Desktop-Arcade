package edu.bsu.cs222.finalproject;

public class RPSGame {
    private final static String userPlay = RPSUserPlayReceiver.getUserPlay();
    private final static String computerPlay = RPSPlayRandomizer.getRandomPlay();
    public static void playRPS() {

        RPSResultDecider.getResult(userPlay, computerPlay);

    }
}
