package edu.bsu.cs222;

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

public class GUITTTPlayMultiplayer implements Initializable {
    @FXML
    private TextArea ruleBox;

    public final ArrayList<String> gameBoard = new ArrayList<>(
            Arrays.asList(" "," "," "," "," "," "," "," "," "));
    public String userOneLetter = " ";
    public String userTwoLetter = " ";
    public int orderOfPlay=0;
    static int userPlay;
    static boolean userOneWin;
    static boolean userTwoWin;
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
        ruleBox.appendText(TTTDialogue.GUITTTMultiplayerRules());
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
        userOneLetter = letterChoiceBox.getValue();
        userTwoLetter=TTTTurnMove.getLetter(userOneLetter);

        if((!userOneWin)&&(!userTwoWin)&&(!draw)){

            boolean openSpace;

                if (orderOfPlay==0) {
                    userInput.setPromptText(TTTDialogue.player1Turn());
                }else{
                    userInput.setPromptText(TTTDialogue.player2Turn());
                }
                String userTextInput = (userInput.getText());

                userPlay = TTTTurnMove.checkUserMove(userTextInput);
                if (userPlay == 9) {
                    ruleBox.appendText(TTTDialogue.invalidUserInput());
                } else {
                    openSpace = TTTGameBoard.emptySpaceCheck(gameBoard, userPlay);
                    if (!openSpace) {
                        ruleBox.appendText(TTTDialogue.improperSpace());
                    } else {
                        if (orderOfPlay==0) {
                            TTTGameBoard.updateGameBoard(gameBoard, userPlay, userOneLetter);
                        }else{
                            TTTGameBoard.updateGameBoard(gameBoard, userPlay, userTwoLetter);
                        }
                    }
                }
                updateGUIGameboard(gameBoard);

                userOneWin = TTTCheckGameboard.checkBoard(userOneLetter, gameBoard);
                userTwoWin = TTTCheckGameboard.checkBoard(userTwoLetter, gameBoard);
                draw = TTTCheckGameboard.checkDraw(gameBoard);

                if (userOneWin) {
                    ruleBox.appendText(TTTDialogue.player1win());
                }
                if (userTwoWin) {
                    ruleBox.appendText(TTTDialogue.player2win());
                }
                if (draw) {
                    ruleBox.appendText(TTTDialogue.drawOutcomeDialogue());
                }
                orderOfPlay=TTTTurnMove.playerTurnCheck(orderOfPlay);
        }
        else{
            ruleBox.setText(TTTDialogue.endDialogue());
        }
    }

    public void updateGUIGameboard(ArrayList<String> gameBoard){
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
