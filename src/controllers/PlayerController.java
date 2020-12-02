package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import utils.SceneChange;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * controls the table view
 */
public class PlayerController implements Initializable {

    /**
     * changes to chart view
     * @param actionEvent
     * @throws IOException
     */
    public void changeToChartView(javafx.event.ActionEvent actionEvent) throws IOException {
        SceneChange.changeScene(actionEvent, "../views/PlayerView.fxml", "RaptorsRoster - Player Info");
    }


    /**
     * fills the table with database info
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}

