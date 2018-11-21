import javafx.scene.layout.FlowPane;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import java.net.URL;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class ExtendedButton extends Application{


    @FXML   
    private FlowPane root;

    public void handleButtonAction(ActionEvent event) {
        root.setStyle("-fx-background-color:#56ee00;");// when the button is pressed it changes the background color
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlURL = ExtendedButton.class.getResource("Main.fxml"); // gets resource from fxml file

        primaryStage.setTitle("ayyy lmao");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(fxmlURL);
        FlowPane Flowpane = loader.load();

        Scene scene = new Scene(Flowpane);
        primaryStage.setScene(scene); // makes a scene using flowpane
        primaryStage.show();
    }

    public static void main(String[] args) {
      launch(args);
    }
}