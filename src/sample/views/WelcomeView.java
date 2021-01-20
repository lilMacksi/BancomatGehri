package sample.views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class WelcomeView {
    @FXML
    GridPane welcomeScreen ;

    @FXML
    Label welcomeText;

    @FXML
    Label insertCardText;

    public WelcomeView() {
    }

    public WelcomeView(GridPane welcomeScreen, Label welcomeText, Label insertCardText) {
        this.welcomeScreen = welcomeScreen;
        this.welcomeText = welcomeText;
        this.insertCardText = insertCardText;
    }

    @FXML
    public GridPane createGrid(){
        welcomeScreen = new GridPane();

        welcomeText = new Label("Welcome!");
        insertCardText = new Label("Please insert you card");
        welcomeScreen.add(welcomeText, 1, 0);
        welcomeScreen.setColumnSpan(welcomeText, 2);
        welcomeScreen.add(insertCardText, 1, 1);
        welcomeScreen.setColumnSpan(insertCardText, 2);

        return welcomeScreen;
    }
}
