import javafx.application.Application;
import javafx.stage.Stage;
import jdk.jshell.spi.ExecutionControl.ExecutionControlException;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class BigFrame extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Switchaxe is the best weapon."); // sets the window name as Switchaxe is the best weapon(and it is)

        Label SwitchaxeLabel = new Label("LBG is bad"); // this prints out in the window light bowgun is bad(which it is)
        Scene scene = new Scene(SwitchaxeLabel, 400, 300); // this determines how big the window is

        primaryStage.setResizable(true); // makes it so you can resize the window
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args); // launches the application
    }
}