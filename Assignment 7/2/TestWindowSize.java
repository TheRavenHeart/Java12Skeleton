import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.application.Application;
public class TestWindowSize extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Test Frame 2");

int True = 200; 
int Other= 100;

while(True < 500){ // as long as true is less then 500 it increases true and other
    
Label label = new Label("The second test");
        Scene scene = new Scene(label, True, Other);
        primaryStage.setScene(scene); 

        primaryStage.show();
        
True ++;
Other ++;
           }
        
    

}
    public static void main(String[] args) {
        Application.launch(args);
    }
}

