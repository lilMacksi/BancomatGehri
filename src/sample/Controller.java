package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import sample.views.EnterPinView;
import sample.views.WelcomeView;

public class Controller {
    DB db = new DB();

    /**
     * One button
     */
    @FXML
    private Button one;

    /**
     * Two button
     */
    @FXML
    private Button two;

    /**
     * Three button
     */
    @FXML
    private Button three;

    /**
     * Four button
     */
    @FXML
    private Button four;

    /**
     * Five button
     */
    @FXML
    private Button five;

    /**
     * Six button
     */
    @FXML
    private Button six;

    /**
     * Seven button
     */
    @FXML
    private Button seven;

    /**
     * Eight button
     */
    @FXML
    private Button eight;

    /**
     * Nine button
     */
    @FXML
    private Button nine;

    /**
     * Zero button
     */
    @FXML
    private Button zero;

    /**
     * Cancel button
     */
    @FXML
    private Button cancel;


    /**
     * Clear button
     */
    @FXML
    private Button clear;


    /**
     * Enter button
     */
    @FXML
    private Button enter;

    /**
     * Display Pane
     */
    @FXML
    private Pane display;

    /**
     * Dropdown to select card
     */
    @FXML
    private ComboBox selectCardDropdown;

    @FXML
    public void initialize() {
        WelcomeView welcomeView = new WelcomeView();
        this.display.getChildren().add(welcomeView.createGrid());
    }


    public void setEnterPinView() {
        EnterPinView enterPinView = new EnterPinView();
        this.display.getChildren().add(enterPinView.createGrid());
    }

    @FXML
    void handleButtonAction(ActionEvent event) {
        Button source = (Button) event.getSource();

    }

    @FXML
    void handleDropdownAction(ActionEvent event) {
        ComboBox source = (ComboBox) event.getSource();
        if (source == this.selectCardDropdown) {
            System.out.println(this.selectCardDropdown.getValue());
            setEnterPinView();
        }
    }
}
