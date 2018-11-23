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

//nessesarcy imports
public class TempConversion extends Application {
    double Unumber;
    @FXML
    private TextField TextField1; // grabs the textfield1 from the fmxl file

    @FXML
    private TextField TextField2;

    public void CelButtonAction(ActionEvent event){
        try {
            double c = Double.valueOf(TextField1.getText());
            double f = (c * (9/5)) + 32;
            TextField2.setText(String.valueOf(f));
        } catch(Exception e){
            TextField2.setText("invalid Input");
        }

    
    }

    

    public void FarButtonAction(ActionEvent event){
        try{
            double u = Double.valueOf(TextField1.getText());
            double g = (u - 36) * 5/9;
            TextField2.setText(String.valueOf(f));
        } catch(Exception e){
            TextField2.setText("invalid Input");
        }
    }

    public void CLEARButtonAction(ActionEvent event) {

        TextField2.setText("");
        TextField1.setText("");

    }

    
    public void start(Stage primaryStage) throws Exception {
        
        
        
        URL fxmlURL = TempConversion.class.getResource("Main.fxml");
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

    