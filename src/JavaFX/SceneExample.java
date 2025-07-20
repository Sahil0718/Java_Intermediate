package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SceneExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Text t1 = new Text("WELCOME!");
        t1.setX(100);
        t1.setY(100);
        t1.setFont(Font.font("JetBrains Mono", 60));
        t1.setFill(Color.RED);
        t1.setStroke(Color.WHITE);
        t1.setStrokeWidth(1.5);
        t1.setStrikethrough(true);

        Line line = new Line();
        line.setStartX(150);
        line.setStartY(300);
        line.setEndX(400);
        line.setEndY(500);
        line.setStroke(Color.BLUE);
        line.setStrokeWidth(2);

        Rectangle box = new Rectangle();
        box.setX(500);
        box.setY(100);
        box.setWidth(150);
        box.setHeight(50);
        box.setFill(Color.GREEN);
        box.setStroke(Color.BLACK);

        // Add all nodes to a layout
        BorderPane root = new BorderPane();
        root.setTop(t1);
        root.setLeft(line);
        root.setRight(box);

        Scene scene = new Scene(root, 800, 600, Color.LIGHTGRAY);
        stage.setScene(scene);
        stage.setTitle("JavaFX Scene Example");
        stage.show();

    }
}
