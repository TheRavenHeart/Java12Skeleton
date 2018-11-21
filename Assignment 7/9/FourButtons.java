import javafx.scene.layout.Background;
import javafx.scene.layout.FlowPane;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import java.net.URL;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class FourButtons extends Application{


    @FXML   
    private FlowPane root;

    public void handleButtonAction(ActionEvent event) {//sets to green
        root.setStyle("-fx-background-color:#38ee00");
    }

    public void handleButtonActionTwo(ActionEvent event) { // sets to red
        root.setStyle("-fx-background-color:#FF0000");
    }

    public void handleButtonActionThree(ActionEvent event) { // sets to blue
        root.setStyle("-fx-background-color:#4169E1");
    }

    public void handleButtonActionFour(ActionEvent event) {//sets to light green
        root.setStyle("-fx-background-color:#8FBC8F");
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlURL = FourButtons.class.getResource("Main.fxml");

        primaryStage.setTitle("ayyy lmao");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(fxmlURL); // makes a scene
        FlowPane Flowpane = loader.load();

        Scene scene = new Scene(Flowpane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
      launch(args);
    }
}