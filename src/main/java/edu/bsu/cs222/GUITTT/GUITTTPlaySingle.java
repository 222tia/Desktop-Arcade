package edu.bsu.cs222.GUITTT;

import edu.bsu.cs222.TTT.TTTDialogue;
import edu.bsu.cs222.TTT.TTTGameBoard;
import edu.bsu.cs222.TTT.TTTCheckGameboard;
import edu.bsu.cs222.TTT.TTTTurnMove;
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

@SuppressWarnings("RedundantThrows")
public class GUITTTPlaySingle implements Initializable {
    @FXML
    private TextArea ruleBox;

    public final ArrayList<String> gameBoard = new ArrayList<>(
            Arrays.asList(" "," "," "," "," "," "," "," "," "));
    public String userLetter = " ";
    public String compLetter = " ";
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ruleBox.appendText(TTTDialogue.GUITTTRules());
        letterChoiceBox.getItems().addAll(letterChoice);
        userInput.setEditable(false);
        letterChoiceBox.setOnAction(event -> userInput.setEditable(true));
        userInput.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                try {
                    onTTTInput();
                    letterChoiceBox.setDisable(true);
                    userInput.clear();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @FXML
    public void onTTTInput() throws IOException {
        userLetter = letterChoiceBox.getValue();
        int compTurnCheck=1;
        if (userLetter.equals("O")){
            compLetter="X";
        }
        else{
            compLetter="O";
        }
        if((!userWin)&&(!compWin)&&(!draw)){
            boolean openSpace;
                String userTextInput = (userInput.getText());
                userPlay = TTTTurnMove.checkUserMove(userTextInput);
                if (userPlay==9){
                    ruleBox.appendText(TTTDialogue.invalidUserInput());
                    compTurnCheck=0;
                }
                else {
                    openSpace = TTTGameBoard.emptySpaceCheck(gameBoard, userPlay);
                    if (!openSpace) {
                        ruleBox.appendText(TTTDialogue.improperSpace());
                        compTurnCheck = 0;
                    }
                    else{
                        TTTGameBoard.updateGameBoard(gameBoard, userPlay, userLetter);
                    }
                }

            GameDisplay(gameBoard);
            userWin = TTTCheckGameboard.checkBoard(userLetter, gameBoard);
            if(!userWin){
                draw = TTTCheckGameboard.checkDraw(gameBoard);
            }

            if(userWin){
                ruleBox.appendText(TTTDialogue.userWinDialogue());
                compTurnCheck = 0;
            }
            if(draw){
                ruleBox.appendText(TTTDialogue.drawOutcomeDialogue());
                compTurnCheck = 0;
            }

            if(compTurnCheck==1) {
                compPlay = TTTTurnMove.getCompTurnMove(gameBoard, compLetter, userLetter);
                TTTGameBoard.updateGameBoard(gameBoard, compPlay, compLetter);
                GameDisplay(gameBoard);
                compWin = TTTCheckGameboard.checkBoard(compLetter, gameBoard);
                if (!compWin) {
                    draw = TTTCheckGameboard.checkDraw(gameBoard);
                }

                if (compWin) {
                    ruleBox.appendText(TTTDialogue.compWinDialogue());
                }
                if (draw) {
                    ruleBox.appendText(TTTDialogue.drawOutcomeDialogue());
                }
            }
        }
        else{
            ruleBox.setText(TTTDialogue.EndDialogue());
        }
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
}
