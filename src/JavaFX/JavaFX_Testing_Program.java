package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFX_Testing_Program extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello, JavaFX!");
        Button button = new Button("Click Me");

        button.setOnAction(e -> label.setText("Button Clicked!"));

        StackPane layout = new StackPane();
        layout.getChildren().addAll(label, button);

        StackPane.setAlignment(label, javafx.geometry.Pos.TOP_CENTER);
        StackPane.setAlignment(button, javafx.geometry.Pos.CENTER);

        Scene scene = new Scene(layout, 300, 200);

        primaryStage.setTitle("JavaFX Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
