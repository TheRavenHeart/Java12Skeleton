import javafx.scene.layout.FlowPane;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import java.net.URL;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class BackgroundChangeButton extends Application{


    @FXML   
    private FlowPane root;

    public void handleButtonAction(ActionEvent event) {//changes background to green
        root.setStyle("-fx-background-color:#34ee00;");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlURL = BackgroundChangeButton.class.getResource("Main.fxml");

        primaryStage.setTitle("ayyy lmao");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(fxmlURL);
        FlowPane Flowpane = loader.load();

        Scene scene = new Scene(Flowpane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
      launch(args);
    }
}
      
        

