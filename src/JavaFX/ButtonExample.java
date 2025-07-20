package JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class ButtonExample extends Application implements EventHandler<ActionEvent> {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button b1 = new Button("Save");
        b1.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, 10));
        b1.setOnAction(this);

        BorderPane root = new BorderPane();
        root.setCenter(b1);
        Scene s1 = new Scene(root, 600, 500);
        stage.setScene(s1);
        stage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        System.out.println("Save button clicked!");
    }
}
