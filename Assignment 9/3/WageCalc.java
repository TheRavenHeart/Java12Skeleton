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
public class WageCalc extends Application {
    double Unumber;
    @FXML
    private TextField TextField1; // grabs the textfields from the fmxl file

    @FXML
    private TextField TextField2;

    @FXML
    private TextField TextField3;

    public void InButtonAction(ActionEvent event) {
        try {
            double m = Double.valueOf(TextField1.getText());
            double h = Double.valueOf(TextField2.getText());
            Unumber = m * h; // multiplies wage by hour
            TextField3.setText(String.valueOf(Unumber));
        } catch (Exception e) {
            TextField3.setText("invalid Input");
        }

    }

    public void start(Stage primaryStage) throws Exception {

        URL fxmlURL = WageCalc.class.getResource("Main.fxml");
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