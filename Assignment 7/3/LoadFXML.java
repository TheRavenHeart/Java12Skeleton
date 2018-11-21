import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.net.URL;

public class LoadFXML extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlURL = LoadFXML.class.getResource("Main.fxml"); // loads in informarmation from the fxml file

        primaryStage.setTitle("ayyy lmao"); // sets the title of the window
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(fxmlURL);
        VBox vbox = loader.load();

        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}