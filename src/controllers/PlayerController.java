package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import models.Player;
import utils.SceneChange;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PlayerController implements Initializable {

    @FXML
    private Label numLabel;

    @FXML
    private Label nameLabel;

    @FXML
    private Label positionLabel;

    @FXML
    private Label birthLabel;

    @FXML
    private Label weightLabel;

    @FXML
    private Label ageLabel;

    @FXML
    private Label collegeLabel;

    @FXML
    private ImageView playerPicture;

    private static Player selectedPlayer;

    public static void initData(Player player)
    {
        selectedPlayer = player;
    }


    public void changeView(javafx.event.ActionEvent actionEvent) throws IOException {
        SceneChange.changeScene(actionEvent, "../views/TeamView.fxml", "RaptorsRoster - Select A Player",null);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        playerPicture.setImage(new Image(selectedPlayer.getImgURL()));
        positionLabel.setText(selectedPlayer.getPos());
        birthLabel.setText(""+selectedPlayer.getBorn());
        weightLabel.setText(""+selectedPlayer.getWeight());
        ageLabel.setText(""+(2019-selectedPlayer.getBorn()));
        collegeLabel.setText(selectedPlayer.getCollege());
        numLabel.setText(""+selectedPlayer.getNum());
        nameLabel.setText(selectedPlayer.getName());
    }
}

