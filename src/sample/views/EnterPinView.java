package sample.views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class EnterPinView {
    @FXML
    private GridPane display;

    @FXML
    private javafx.scene.control.Label text;

    @FXML
    private javafx.scene.control.TextField pinInput;

    public EnterPinView(GridPane display, Label text, TextField pinInput) {
        this.display = display;
        this.text = text;
        this.pinInput = pinInput;
    }

    public EnterPinView() {
    }

    @FXML
    public GridPane createGrid(){
        display = new GridPane();
        text = new javafx.scene.control.Label("Enter your PIN:");
        pinInput = new TextField();

        display.add(text, 0,1);
        display.setColumnSpan(text, 2);
        display.add(pinInput, 1,2);
        display.setColumnSpan(pinInput, 2);

        return display;
    }
}
