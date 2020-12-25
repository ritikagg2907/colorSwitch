package colorSwitch;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import static javafx.scene.paint.Color.*;

public class GamePlay extends Application {


    @Override
    public void start(Stage stage) throws Exception {


        GridPane grid = FXMLLoader.load(getClass().getResource("GamePlay.fxml"));


        Scene scene = new Scene(grid);

        stage.setTitle("Game screen");


        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}

