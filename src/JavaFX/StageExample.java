package JavaFX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;

import java.awt.*;

public class StageExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage Primarystage) throws Exception {
        Group r1 = new Group();
        Scene S1 = new Scene(r1,600,500, Color.DARKGRAY);
        Primarystage.setScene(S1);
        Primarystage.setTitle("JAVAFX Stage Example");
        Image image = new Image("file:///C:/Users/Asus/IdeaProjects/Java_Intermediate/src/sunrise.jpg");
        Primarystage.getIcons().add(image);
        Primarystage.setResizable(false);
        Primarystage.setX(50);
        Primarystage.setY(60);

        Primarystage.show();
    }
}
