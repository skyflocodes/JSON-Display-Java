package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import models.Player;
import utils.JSONFileUtil;
import utils.SceneChange;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * controls the chart view
 */
public class TeamController implements Initializable {

    @FXML
    private ListView<Player> playerListView;
    /**
     * changes scenes to table view
     * @param actionEvent
     * @throws IOException
     */
    public void changeView(javafx.event.ActionEvent actionEvent) throws IOException {
        SceneChange.changeScene(actionEvent, "../views/PlayerView.fxml", "RaptorsRoster - Player Info");
    }

    /**
     * fills the chart with info from the database, and hides the legend
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        playerListView.getItems().addAll(JSONFileUtil.getRoster("Roster.json"));
    }
}
