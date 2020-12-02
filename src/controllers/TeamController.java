package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import utils.SceneChange;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * controls the chart view
 */
public class TeamController implements Initializable {

    /**
     * changes scenes to table view
     * @param actionEvent
     * @throws IOException
     */
    public void changeToTableView(javafx.event.ActionEvent actionEvent) throws IOException {
        SceneChange.changeScene(actionEvent, "../views/TeamView.fxml", "RaptorsRoster - Select A Player");
    }

    /**
     * fills the chart with info from the database, and hides the legend
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
