package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import models.Player;
import utils.JSONFileUtil;
import utils.SceneChange;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * controls the chart view
 */
public class TeamController implements Initializable {

    @FXML
    private ListView<Player> playerListView;

    @FXML
    private ImageView playerPicture;

    public void changeView(javafx.event.ActionEvent actionEvent) throws IOException {
        SceneChange.changeScene(actionEvent, "../views/PlayerView.fxml", "RaptorsRoster - Player Info");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        playerListView.getSelectionModel().selectedItemProperty().addListener(
                (obs,oldValue, playerSelected)->{
                    playerPicture.setImage(new Image(playerSelected.getImgURL()));
                }
        );
        playerListView.getItems().addAll(JSONFileUtil.getRoster("Roster.json"));
    }
}
