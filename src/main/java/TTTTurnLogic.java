import java.util.ArrayList;

public class TTTTurnLogic {

    public static Integer TurnLogicCheck(ArrayList<String> gameBoard, String letter){
        int compTurn = RowsAI(letter, gameBoard);
        if (compTurn==9){
            compTurn = ColumnsAI(letter, gameBoard);
            if (compTurn==9){
                compTurn = DiagonalsAI(letter, gameBoard);
            }
        }
        return compTurn;
    }
    public static Integer RowsAI(String letter, ArrayList<String> gameBoard){
        if(gameBoard.get(0).equals(" ") && gameBoard.get(1).equals(letter) && gameBoard.get(2).equals(letter)){
            return 0;
        }
        if(gameBoard.get(0).equals(letter) && gameBoard.get(1).equals(" ") && gameBoard.get(2).equals(letter)){
            return 1;
        }
        if(gameBoard.get(0).equals(letter) && gameBoard.get(1).equals(letter) && gameBoard.get(2).equals(" ")){
            return 2;
        }
        if(gameBoard.get(3).equals(" ") && gameBoard.get(4).equals(letter) && gameBoard.get(5).equals(letter)){
            return 3;
        }
        if(gameBoard.get(3).equals(letter) && gameBoard.get(4).equals(" ") && gameBoard.get(5).equals(letter)){
            return 4;
        }
        if(gameBoard.get(3).equals(letter) && gameBoard.get(4).equals(letter) && gameBoard.get(5).equals(" ")){
            return 5;
        }
        if(gameBoard.get(6).equals(" ") && gameBoard.get(7).equals(letter) && gameBoard.get(8).equals(letter)){
            return 6;
        }
        if(gameBoard.get(6).equals(letter) && gameBoard.get(7).equals(" ") && gameBoard.get(8).equals(letter)){
            return 7;
        }
        if(gameBoard.get(6).equals(letter) && gameBoard.get(7).equals(letter) && gameBoard.get(8).equals(" ")){
            return 8;
        }
        return 9;
    }

    public static Integer ColumnsAI(String letter, ArrayList<String> gameBoard){
        if(gameBoard.get(0).equals(" ") && gameBoard.get(3).equals(letter) && gameBoard.get(6).equals(letter)){
            return 0;
        }
        if(gameBoard.get(0).equals(letter) && gameBoard.get(3).equals(" ") && gameBoard.get(6).equals(letter)){
            return 3;
        }
        if(gameBoard.get(0).equals(letter) && gameBoard.get(3).equals(letter) && gameBoard.get(6).equals(" ")){
            return 6;
        }
        if(gameBoard.get(1).equals(" ") && gameBoard.get(4).equals(letter) && gameBoard.get(7).equals(letter)){
            return 1;
        }
        if(gameBoard.get(1).equals(letter) && gameBoard.get(4).equals(" ") && gameBoard.get(7).equals(letter)){
            return 4;
        }
        if(gameBoard.get(1).equals(letter) && gameBoard.get(4).equals(letter) && gameBoard.get(7).equals(" ")){
            return 7;
        }
        if(gameBoard.get(2).equals(" ") && gameBoard.get(5).equals(letter) && gameBoard.get(8).equals(letter)){
            return 2;
        }
        if(gameBoard.get(2).equals(letter) && gameBoard.get(5).equals(" ") && gameBoard.get(8).equals(letter)){
            return 5;
        }
        if(gameBoard.get(2).equals(letter) && gameBoard.get(5).equals(letter) && gameBoard.get(8).equals(" ")){
            return 8;
        }
        return 9;
    }

    public static Integer DiagonalsAI(String letter, ArrayList<String> gameBoard){
        if(gameBoard.get(0).equals(" ") && gameBoard.get(4).equals(letter) && gameBoard.get(8).equals(letter)) {
            return 0;
        }
        if(gameBoard.get(0).equals(letter) && gameBoard.get(4).equals(" ") && gameBoard.get(8).equals(letter)){
            return 4;
        }
        if(gameBoard.get(0).equals(letter) && gameBoard.get(4).equals(letter) && gameBoard.get(8).equals(" ")){
            return 8;
        }
        if(gameBoard.get(2).equals(" ") && gameBoard.get(4).equals(letter) && gameBoard.get(6).equals(letter)){
            return 2;
        }
        if(gameBoard.get(2).equals(letter) && gameBoard.get(4).equals(" ") && gameBoard.get(6).equals(letter)){
            return 4;
        }
        if(gameBoard.get(2).equals(letter) && gameBoard.get(4).equals(letter) && gameBoard.get(6).equals(" ")){
            return 6;
        }
        return 9;
    }



}
