import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import models.Player;

public class Main extends Application {

    /**
     * opens the primary stage (chartview) and sets the application icon
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("views/TeamView.fxml"));
        primaryStage.setTitle("RaptorsRoster - Select A Player");
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("style/style.css").toExternalForm());
        primaryStage.getIcons().add(new Image("style/Icon.png"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * launches the args
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }
}
//--module-path "C:\Program Files\Java\javafx-sdk-15.0.1\lib" --add-modules javafx.controls,javafx.fxml