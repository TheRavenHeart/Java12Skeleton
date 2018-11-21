import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.net.URL;

public class ButtonDemo extends Application {
    @FXML private Button secondButton;
    public void handleButtonAction(ActionEvent event) {
        System.out.println("Overlord's 2nd ending is good."); // whenever the button is pressed it prints out this message in the terminal/output
        
    }

    public void betterButtonAction(ActionEvent actionEvent) {

        Stage stage = (Stage)secondButton.getScene().getWindow();
        stage.close(); // when the better button is pressed it closes the window
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlURL = ButtonDemo.class.getResource("Main2.fxml");

        primaryStage.setTitle("ayyy lmao");
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

