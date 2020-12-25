package colorSwitch;

import javafx.animation.RotateTransition;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.Group;
import javafx.util.Duration;

public abstract class Obstacles {
    private float cx;
    private float cy;
    private float len;
    private float width;


    public Obstacles() {

    }

    public void setCx(float x){
        this.cx = x;
    }

    public void setCy(float y){
        this.cy = y;
    }

    public void setLen(float len){
        this.len = len;
    }
    public void setWidth(float width){
        this.width = width;
    }

    public float getCx() {
        return cx;
    }

    public float getCy() {
        return cy;
    }

    public float getLen() {
        return len;
    }

    public float getWidth() {
        return width;
    }

    public void rotateObstacle(Group group, double fromAngle, double toAngle, double rate) {
        RotateTransition rotate = new RotateTransition(Duration.seconds(1), group);
        rotate.setFromAngle(fromAngle);
        rotate.setToAngle(toAngle);
        rotate.setRate(rate);
        rotate.setCycleCount(RotateTransition.INDEFINITE);
        rotate.play();

    }

    public abstract Group createObstacle();

}