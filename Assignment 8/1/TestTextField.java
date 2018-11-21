import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.net.URL;
import javafx.scene.control.Label;


public class TestTextField extends Application {
    @Override
        public void start(Stage primaryStage) throws Exception {
            URL fxmlURL = TestTextField.class.getResource("Main.fxml");
            primaryStage.setTitle("DUNNO");
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

