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
//nessesarcy imports
public class PercentFat extends Application {
    @FXML   
    private TextField TextField1; //grabs the textfield1 from the fmxl file

    @FXML
    private TextField TextField2;

    @FXML
    private void initialize(){
        TextField1.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    double f = Double.valueOf(newValue);
                   
                    TextField2.setText(String.valueOf(c));
                } catch(Exception e){
                    TextField2.setText("invalid Input");
                }
                System.out.println(" Text Changed to  " + newValue + ")\n");
                
                
            }
        });
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
//percent = ((fateGrams * 9.0) / Calories) * 100.0