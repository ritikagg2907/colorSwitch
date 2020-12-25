
package colorSwitch;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AllAnimations extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Rectangle rect = new Rectangle(200.0f, 400.0f, 200f, 20);


       // Cross cir = new Cross(200.f, 100.f, 83f, 11);


      //  Circles cir2 = new Circles(200.f, 100.f, 110f, 25);


        //Group circle = cir.Cross();
        //Group circle2 = cir2.Circles();

        BallChanger b = new BallChanger(100f, 100f, 20f);


        Group b1 = b.createBallChanger();

        RotateTransition rot = new RotateTransition(Duration.seconds(1), rect.group);
        rot.setFromAngle(405);
        rot.setToAngle(45);
        rot.setRate(0.2);
        rot.setCycleCount(RotateTransition.INDEFINITE);
        rot.play();

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setStyle("-fx-background-color: #000000");

        AnchorPane.setTopAnchor(rect.group, 360.0);
        AnchorPane.setLeftAnchor(rect.group, 360.0);
        AnchorPane.setRightAnchor(rect.group, 360.0);
        AnchorPane.setBottomAnchor(rect.group, 360.0);

        AnchorPane.setTopAnchor(b1, 360.0);
        AnchorPane.setLeftAnchor(b1, 360.0);
        AnchorPane.setRightAnchor(b1, 360.0);
        AnchorPane.setBottomAnchor(b1, 360.0);

        ObservableList list = anchorPane.getChildren();

        list.addAll( b1,  rect.group);

        Scene scene = new Scene(anchorPane);

        stage.setTitle("Anchor Pane Example");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
