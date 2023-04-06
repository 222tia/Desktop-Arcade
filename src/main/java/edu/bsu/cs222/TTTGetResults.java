package edu.bsu.cs222;

import java.util.ArrayList;

public class TTTGetResults {
    public static boolean checkBoard(String letter, ArrayList<String> gameBoard){
        return (checkRows(letter, gameBoard) || checkColumns(letter, gameBoard) || checkDiagonals(letter, gameBoard));
    }

    public static boolean checkRows(String letter, ArrayList<String> gameBoard){
        return (gameBoard.get(0).equals(letter) && gameBoard.get(1).equals(letter) && gameBoard.get(2).equals(letter)) ||
                (gameBoard.get(3).equals(letter) && gameBoard.get(4).equals(letter) && gameBoard.get(5).equals(letter)) ||
                (gameBoard.get(6).equals(letter) && gameBoard.get(7).equals(letter) && gameBoard.get(8).equals(letter));
    }

    public static boolean checkColumns(String letter, ArrayList<String> gameBoard){
        return (gameBoard.get(0).equals(letter) && gameBoard.get(3).equals(letter) && gameBoard.get(6).equals(letter)) ||
                (gameBoard.get(1).equals(letter) && gameBoard.get(4).equals(letter) && gameBoard.get(7).equals(letter)) ||
                (gameBoard.get(2).equals(letter) && gameBoard.get(5).equals(letter) && gameBoard.get(8).equals(letter));
    }

    public static boolean checkDiagonals(String letter, ArrayList<String> gameBoard){
        return (gameBoard.get(0).equals(letter) && gameBoard.get(4).equals(letter) && gameBoard.get(8).equals(letter)) ||
                (gameBoard.get(2).equals(letter) && gameBoard.get(4).equals(letter) && gameBoard.get(6).equals(letter));
    }

    public static boolean checkDraw(ArrayList<String> gameBoard){
        return !(gameBoard.contains(" "));
    }
}
