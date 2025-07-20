package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage Primarystage) throws Exception {
        // Create Buttons
        Button b1 = new Button("Button1");
        Button b2 = new Button("Button2");
        Button b3 = new Button("Button3");

        // Create HBox with spacing of 20 pixels
        HBox hbox = new HBox(20);
        hbox.getChildren().addAll(b1, b2, b3);

        // Set padding and center alignment
        hbox.setPadding(new Insets(15));
        hbox.setAlignment(Pos.CENTER);

        // Create the scene and show the stage
        Scene scene = new Scene(hbox, 300, 100);
        Primarystage.setTitle("HBOX Example!");
        Primarystage.setScene(scene);
        Primarystage.show();
    }
}
