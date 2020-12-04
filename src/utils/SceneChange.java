package utils;
import controllers.PlayerController;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.Player;

import java.io.IOException;

public class SceneChange {
    /**
     * change scene utility swaps the current scene to another scene
     * @param event
     * @param location
     * @param windowName
     * @throws IOException
     */
    public static void changeScene(javafx.event.ActionEvent event, String location, String windowName, Player player) throws IOException {
        if (player != null) PlayerController.initData(player);
        Object object = new Object(){};
        Parent root = FXMLLoader.load(object.getClass().getResource(location));
        Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        primaryStage.setTitle(windowName);
        Scene scene = new Scene(root);
        scene.getStylesheets().add(object.getClass().getResource("../style/style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
