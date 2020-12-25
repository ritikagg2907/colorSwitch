package colorSwitch;


import com.sun.scenario.effect.impl.state.GaussianRenderState;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.List;

public class Main extends Application {
    private List<Integer> myList;

    @Override
    public void start(Stage stage) throws Exception{

        GridPane grid = FXMLLoader.load(getClass().getResource("main.fxml"));



        Scene scene = new Scene(grid);

        stage.setTitle("Main Menu");


        stage.setScene(scene);
        stage.setResizable(false);

        stage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}