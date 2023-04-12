package edu.bsu.cs222;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class GUITTTPlay implements Initializable {
    @FXML
    private TextArea ruleBox;

    public ArrayList<String> gameBoard = new ArrayList<>(
            Arrays.asList(" "," "," "," "," "," "," "," "," "));
    public String userLetter = "X";
    public String compLetter = "O";
    static int userPlay;
    static int compPlay;
    static boolean userWin;
    static boolean compWin;
    static boolean draw;
    private final String[] letterChoice = {"X", "O"};
    @FXML
    private ChoiceBox<String> letterChoiceBox;
    @FXML
    private TextField userInput;
    @FXML
    private TextArea space1, space2, space3, space4, space5, space6, space7, space8, space9;

    public GUITTTPlay() {
    }

    @FXML
    public void onTTTInput() throws IOException {
        userLetter = letterChoiceBox.getValue();
        if (userLetter.equals("O")){
            compLetter="X";
        }
        else{
            compLetter="O";
        }
        do {
            boolean openSpace;
            do {
                userPlay = Integer.parseInt(userInput.getText());
                openSpace = TTTGameBoard.emptySpaceCheck(gameBoard, userPlay);
                if (!openSpace) {
                    ruleBox.appendText(GUITTTDialogue.improperSpace());
                }
            } while (!openSpace);

            gameBoard = TTTGameBoard.updateGameBoard(gameBoard, userPlay, userLetter);
            GameDisplay(gameBoard);
            userWin = TTTGetResults.checkBoard(userLetter, gameBoard);
            if(!userWin){
                draw = TTTGetResults.checkDraw(gameBoard);
            }

            if(userWin){
                ruleBox.appendText(GUITTTDialogue.userWinDialogue());
            }
            if(draw){
                ruleBox.appendText(GUITTTDialogue.drawOutcomeDialogue());
            }

            compPlay = TTTTurnMove.getCompTurnMove(gameBoard, compLetter, userLetter);
            gameBoard = TTTGameBoard.updateGameBoard(gameBoard, compPlay, compLetter);
            GameDisplay(gameBoard);
            compWin = TTTGetResults.checkBoard(compLetter, gameBoard);
            if(!compWin){
                draw = TTTGetResults.checkDraw(gameBoard);
            }

            if(compWin){
                ruleBox.appendText(GUITTTDialogue.compWinDialogue());
            }
            if(draw){
                ruleBox.appendText(GUITTTDialogue.drawOutcomeDialogue());
            }

        }while((!userWin)&&(!compWin));
    }

    public void GameDisplay(ArrayList<String> gameBoard){
        space1.setText(gameBoard.get(0));
        space2.setText(gameBoard.get(1));
        space3.setText(gameBoard.get(2));
        space4.setText(gameBoard.get(3));
        space5.setText(gameBoard.get(4));
        space6.setText(gameBoard.get(5));
        space7.setText(gameBoard.get(6));
        space8.setText(gameBoard.get(7));
        space9.setText(gameBoard.get(8));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ruleBox.appendText(GUITTTDialogue.GUITTTRules());
        letterChoiceBox.getItems().addAll(letterChoice);
        userInput.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                try {
                    onTTTInput();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        }
}
