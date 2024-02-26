import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JavaFxRect extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a rectangle
        Rectangle rectangle = new Rectangle(100, 50, Color.BLUE);

        // Create a stack pane and add the rectangle to it
        StackPane root = new StackPane();
        root.getChildren().add(rectangle);

        // Create a scene with the stack pane as the root node
        Scene scene = new Scene(root, 200, 100);

        // Set the title of the stage and add the scene to it
        primaryStage.setTitle("Draw Rectangle Example");
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

