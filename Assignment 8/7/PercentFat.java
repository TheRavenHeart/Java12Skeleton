import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.net.URL;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.beans.value.*;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

//nessesarcy imports
public class PercentFat extends Application {
    @FXML
    private TextField TextField1; // grabs the textfield1 from the fmxl file

    @FXML
    private TextField TextField2;

    @FXML
    private TextField TextField3;

    @FXML
    private TextField TextField4;

   public void handleButtonAction(ActionEvent event){
    try {
        double f = Double.valueOf(TextField1.getText());
        double c = Double.valueOf(TextField2.getText());
        double u = ((f * 9.0) / c) * 100;
        TextField3.setText(String.valueOf(u));
    } catch(Exception e){
        TextField4.setText("invalid Input");
    }
   }

    public void start(Stage primaryStage) throws Exception {

        URL fxmlURL = PercentFat.class.getResource("Main.fxml");
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
