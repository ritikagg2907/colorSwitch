package colorSwitch;

import javafx.animation.RotateTransition;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class mainController {



    @FXML
    private AnchorPane mainPane;


    @FXML
    private void initialize(){

        Circles cir = new Circles();
        cir.setCentreX(200.f);
        cir.setCentreY(100.f);
        cir.setLength(80f);
        cir.setStrokeWidth(15);

        Circles cir2 = new Circles();
        cir2.setCentreX(200.f);
        cir2.setCentreY(100.f);
        cir2.setLength(110f);
        cir2.setStrokeWidth(20);

        Group circle = cir.Circles();
        Group circle2 = cir2.Circles();
        RotateTransition rotate = new RotateTransition(Duration.seconds(1), circle);
        rotate.setFromAngle(45);
        rotate.setToAngle(405);
        rotate.setRate(0.1);
        rotate.setCycleCount(RotateTransition.INDEFINITE);
        rotate.play();

        RotateTransition rota = new RotateTransition(Duration.seconds(1), circle2);
        rota.setFromAngle(405);
        rota.setToAngle(45);
        rota.setRate(0.2);
        rota.setCycleCount(RotateTransition.INDEFINITE);
        rota.play();

        AnchorPane.setTopAnchor(circle, 280.0);
        AnchorPane.setLeftAnchor(circle, 280.0);
        AnchorPane.setRightAnchor(circle, 260.0);
        AnchorPane.setBottomAnchor(circle, 260.0);

        AnchorPane.setTopAnchor(circle2, 250.0);
        AnchorPane.setLeftAnchor(circle2,250.0);
        AnchorPane.setRightAnchor(circle, 260.0);
        AnchorPane.setBottomAnchor(circle2, 260.0);

        ObservableList list = mainPane.getChildren();
        list.addAll(circle, circle2);



    }





}
