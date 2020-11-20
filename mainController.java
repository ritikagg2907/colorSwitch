package sample;

import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Controller {

    @FXML
    private Circle C1;
    @FXML
    private Circle C2;
    @FXML
    private Circle C3;
    @FXML
    private Arc a1;
    @FXML
    private Arc a2;
    @FXML
    private Arc a3;
    @FXML
    private Arc a4;

    @FXML
    private Arc a11;
    @FXML
    private Arc a21;
    @FXML
    private Arc a31;
    @FXML
    private Arc a41;

    @FXML
    private Arc a111;
    @FXML
    private Arc a211;
    @FXML
    private Arc a311;
    @FXML
    private Arc a411;

    @FXML
    private void play(ActionEvent event){
        setRotate(C1,a1,a2,a3,a4,360,10);
        setRotate(C2,a11,a21,a31,a41,180,10);
        setRotate(C3,a111,a211,a311,a411,145,10);


    }

    private void setRotate(Circle C, Arc a1, Arc a2, Arc a3, Arc a4, int angle, int duration){
        RotateTransition rt = new RotateTransition(Duration.seconds(duration), C);
        RotateTransition rt1 = new RotateTransition(Duration.seconds(duration), a1);
        RotateTransition rt2 = new RotateTransition(Duration.seconds(duration), a2);
        RotateTransition rt3 = new RotateTransition(Duration.seconds(duration), a3);
        RotateTransition rt4 = new RotateTransition(Duration.seconds(duration), a4);

        rt.setByAngle(angle);
        rt1.setByAngle(angle);
        rt2.setByAngle(angle);
        rt3.setByAngle(angle);
        rt4.setByAngle(angle);

        rt.setRate(5);
        rt1.setRate(5);
        rt2.setRate(5);
        rt3.setRate(5);
        rt4.setRate(5);

        rt.setCycleCount(18);
        rt1.setCycleCount(18);
        rt2.setCycleCount(18);
        rt3.setCycleCount(18);
        rt4.setCycleCount(18);

        rt.play();
        rt1.play();
        rt2.play();
        rt3.play();
        rt4.play();








    }


}
