package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import utils.SceneChange;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PlayerController implements Initializable {


    public void changeView(javafx.event.ActionEvent actionEvent) throws IOException {
        SceneChange.changeScene(actionEvent, "../views/TeamView.fxml", "RaptorsRoster - Select A Player");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}

