package edu.bsu.cs222.finalproject;

import java.util.ArrayList;

public class TTTTurnLogic {
    public static boolean RowsAI(String letter, ArrayList<String> gameBoard){
        return (gameBoard.get(0).equals(" ") && gameBoard.get(1).equals(letter) && gameBoard.get(2).equals(letter)) ||
                (gameBoard.get(0).equals(letter) && gameBoard.get(1).equals(" ") && gameBoard.get(2).equals(letter)) ||
                (gameBoard.get(0).equals(letter) && gameBoard.get(1).equals(letter) && gameBoard.get(2).equals(" ")) ||
                (gameBoard.get(3).equals(" ") && gameBoard.get(4).equals(letter) && gameBoard.get(5).equals(letter)) ||
                (gameBoard.get(3).equals(letter) && gameBoard.get(4).equals(" ") && gameBoard.get(5).equals(letter)) ||
                (gameBoard.get(3).equals(letter) && gameBoard.get(4).equals(letter) && gameBoard.get(5).equals(" ")) ||
                (gameBoard.get(6).equals(" ") && gameBoard.get(7).equals(letter) && gameBoard.get(8).equals(letter)) ||
                (gameBoard.get(6).equals(letter) && gameBoard.get(7).equals(" ") && gameBoard.get(8).equals(letter)) ||
                (gameBoard.get(6).equals(letter) && gameBoard.get(7).equals(letter) && gameBoard.get(8).equals(" "));
    }

    public static boolean ColumnsAI(String letter, ArrayList<String> gameBoard){
        return (gameBoard.get(0).equals(" ") && gameBoard.get(3).equals(letter) && gameBoard.get(6).equals(letter)) ||
                (gameBoard.get(0).equals(letter) && gameBoard.get(3).equals(" ") && gameBoard.get(6).equals(letter)) ||
                (gameBoard.get(0).equals(letter) && gameBoard.get(3).equals(letter) && gameBoard.get(6).equals(" ")) ||
                (gameBoard.get(1).equals(" ") && gameBoard.get(4).equals(letter) && gameBoard.get(7).equals(letter)) ||
                (gameBoard.get(1).equals(letter) && gameBoard.get(4).equals(" ") && gameBoard.get(7).equals(letter)) ||
                (gameBoard.get(1).equals(letter) && gameBoard.get(4).equals(letter) && gameBoard.get(7).equals(" ")) ||
                (gameBoard.get(2).equals(" ") && gameBoard.get(5).equals(letter) && gameBoard.get(8).equals(letter)) ||
                (gameBoard.get(2).equals(letter) && gameBoard.get(5).equals(" ") && gameBoard.get(8).equals(letter)) ||
                (gameBoard.get(2).equals(letter) && gameBoard.get(5).equals(letter) && gameBoard.get(8).equals(" "));
    }

    public static boolean DiagonalsAI(String letter, ArrayList<String> gameBoard){
        return (gameBoard.get(0).equals(" ") && gameBoard.get(4).equals(letter) && gameBoard.get(8).equals(letter)) ||
                (gameBoard.get(0).equals(letter) && gameBoard.get(4).equals(" ") && gameBoard.get(8).equals(letter)) ||
                (gameBoard.get(0).equals(letter) && gameBoard.get(4).equals(letter) && gameBoard.get(8).equals(" ")) ||
                (gameBoard.get(2).equals(" ") && gameBoard.get(4).equals(letter) && gameBoard.get(6).equals(letter)) ||
                (gameBoard.get(2).equals(letter) && gameBoard.get(4).equals(" ") && gameBoard.get(6).equals(letter)) ||
                (gameBoard.get(2).equals(letter) && gameBoard.get(4).equals(letter) && gameBoard.get(6).equals(" "));
    }

}
