package colorSwitch;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;

public class BallChanger {


  //  private Group ballGroup;
    private Group ballChangerGroup;


    private float CX;
    private float CY;
    private float len;
    // private float width;


    public BallChanger(float cx, float cy, float len){
        this.CX = cx;
        this.CY=cy;
        this.len = len;

    }

    public Group createBallChanger() {
        Arc arc1 = new Arc();
        arc1.setCenterX(CX);
        arc1.setCenterY(CY);
        arc1.setRadiusX(len);
        arc1.setRadiusY(len);
        arc1.setStartAngle(0f);
        arc1.setLength(5*len);
        arc1.setFill(Color.PURPLE);
        arc1.setType(ArcType.ROUND);

        Arc arc2 = new Arc();
        arc2.setCenterX(CX);
        arc2.setCenterY(CY);
        arc2.setRadiusX(len);
        arc2.setRadiusY(len);
        arc2.setStartAngle(90f);
        arc2.setLength(5*len);
        arc2.setFill(Color.BLUE);
        arc2.setType(ArcType.ROUND);

        Arc arc3 = new Arc();
        arc3.setCenterX(CX);
        arc3.setCenterY(CY);
        arc3.setRadiusX(len);
        arc3.setRadiusY(len);
        arc3.setStartAngle(180f);
        arc3.setLength(5*len);
        arc3.setFill(Color.RED);
        arc3.setType(ArcType.ROUND);

        Arc arc4 = new Arc();
        arc4.setCenterX(CX);
        arc4.setCenterY(CY);
        arc4.setRadiusX(len);
        arc4.setRadiusY(len);
        arc4.setStartAngle(270f);
        arc4.setLength(4.5*len);
        arc4.setFill(Color.GREEN);
        arc4.setType(ArcType.ROUND);

        this.ballChangerGroup = new Group(arc1, arc2, arc3, arc4);
        return ballChangerGroup;

    }

}
