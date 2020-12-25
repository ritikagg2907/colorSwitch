package colorSwitch;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeLineCap;

public class Ball {
    //private Group ballGroup;


    private float CX;
    private float CY;
    private float len;
    // private float width;


    public Ball(float cx, float cy, float len){
        this.CX = cx;
        this.CY=cy;
        this.len = len;
    }

    public Circle createBall() {
        Circle cr = new Circle();
       // cr.setCenterX(CX);
        //cr.setCenterY(CY);
        cr.setLayoutX(this.CX);
        cr.setCenterY(this.CY);
        cr.setRadius(len);
        cr.setFill(Color.RED);
       // this.ballGroup = new Group(cr);
        return cr;
    }

    public void setCX(float CX) {
        this.CX = CX;
    }

    public void setCY(float CY) {
        this.CY = CY;
    }

    public void setLen(float len) {
        this.len = len;
    }
}