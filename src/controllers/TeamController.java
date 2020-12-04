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

public class TeamController implements Initializable {

    @FXML
    private ListView<Player> playerListView;

    @FXML
    private ImageView playerPicture;

    /**
     * changes scenes and passes selected player object through
     * @param actionEvent
     * @throws IOException
     */
    public void changeView(javafx.event.ActionEvent actionEvent) throws IOException {
        if (playerListView.getSelectionModel().getSelectedItem() != null) {
            SceneChange.changeScene(actionEvent, "../views/PlayerView.fxml", "RaptorsRoster - Player Info", playerListView.getSelectionModel().getSelectedItem());
        }
    }

    /**
     * populates the list view and adds the listener
     * @param url
     * @param resourceBundle
     */
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
