import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.application.Application;
public class TestJavaFXApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Test Frame 1");

        Label label = new Label("The First Test");// writes this inside of the window
        Scene scene = new Scene(label, 200, 100); // creates a scene with a label with the dimensions of 200 by 100 pixels
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args); // launches the applications
    }
}