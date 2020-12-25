package colorSwitch;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class Circles extends Obstacles{
    protected Group group;

    //private float CX;
//    private float CY;
//    private float len;
//    private float width;

    public Circles(float cx, float cy, float len, float width){
        this.setCx(cx);
        this.setCy(cy);
        this.setLen(len);
        this.setWidth(width);
        this.createObstacle();
        //this.type = "circle";

    }

    public Circles(float cx, float cy, float len, float width, Paint arc1, Paint arc2, Paint arc3, Paint arc4){
        this.setCx(cx);
        this.setCy(cy);
        this.setLen(len);
        this.setWidth(width);
        this.createObstacle(arc1,arc2, arc3, arc4);
       // this.type = "circle";


    }

    public Group createObstacle(Paint arc1Col, Paint arc2Col, Paint arc3Col, Paint arc4Col) {
        Arc arc1 = new Arc();
        arc1.setCenterX(this.getCx());
        arc1.setCenterY(this.getCy());
        arc1.setRadiusX(this.getLen());
        arc1.setRadiusY(this.getLen());
        arc1.setStrokeWidth(this.getWidth());
        arc1.setStroke(arc1Col);
        arc1.setStartAngle(0f);
        arc1.setLength(this.getLen()*2*(3.14)/4);
        arc1.setFill(null);
        arc1.setType(ArcType.OPEN);

        Arc arc2 = new Arc();
        arc2.setCenterX(this.getCx());
        arc2.setCenterY(this.getCy());
        arc2.setRadiusX(this.getLen());
        arc2.setRadiusY(this.getLen());
        arc2.setStrokeWidth(this.getWidth());
        arc2.setStroke(arc2Col);
        arc2.setStartAngle(90f);
        arc2.setLength(this.getLen()*2*(3.14)/4);
        arc2.setFill(null);
        arc2.setType(ArcType.OPEN);

        Arc arc3 = new Arc();
        arc3.setCenterX(this.getCx());
        arc3.setCenterY(this.getCy());
        arc3.setRadiusX(this.getLen());
        arc3.setRadiusY(this.getLen());
        arc3.setStrokeWidth(this.getWidth());
        arc3.setStroke(arc3Col);
        arc3.setStartAngle(180f);
        arc3.setLength(this.getLen()*2*(3.14)/4);
        arc3.setFill(null);
        arc3.setType(ArcType.OPEN);

        Arc arc4 = new Arc();
        arc4.setCenterX(this.getCx());
        arc4.setCenterY(this.getCy());
        arc4.setRadiusX(this.getLen());
        arc4.setRadiusY(this.getLen());
        arc4.setStrokeWidth(this.getWidth());
        arc4.setStroke(arc4Col);
        arc4.setStartAngle(270f);
        arc4.setLength(this.getLen()*2*(3.14)/4);
        arc4.setFill(null);
        arc4.setType(ArcType.OPEN);

        //Group cir = new Group(arc1, arc2, arc3, arc4);
        this.group = new Group(arc1, arc2, arc3, arc4);
        return group;

    }




    @Override
    public Group createObstacle() {

        Arc arc1 = new Arc();
        arc1.setCenterX(this.getCx());
        arc1.setCenterY(this.getCy());
        arc1.setRadiusX(this.getLen());
        arc1.setRadiusY(this.getLen());
        arc1.setStrokeWidth(this.getWidth());
        arc1.setStroke(Color.PURPLE);
        arc1.setStartAngle(0f);
        arc1.setLength(this.getLen());
        arc1.setFill(null);
        arc1.setType(ArcType.OPEN);

        Arc arc2 = new Arc();
        arc2.setCenterX(this.getCx());
        arc2.setCenterY(this.getCy());
        arc2.setRadiusX(this.getLen());
        arc2.setRadiusY(this.getLen());
        arc2.setStrokeWidth(this.getWidth());
        arc2.setStroke(Color.BLUE);
        arc2.setStartAngle(90f);
        arc2.setLength(this.getLen());
        arc2.setFill(null);
        arc2.setType(ArcType.OPEN);

        Arc arc3 = new Arc();
        arc3.setCenterX(this.getCx());
        arc3.setCenterY(this.getCy());
        arc3.setRadiusX(this.getLen());
        arc3.setRadiusY(this.getLen());
        arc3.setStrokeWidth(this.getWidth());
        arc3.setStroke(Color.RED);
        arc3.setStartAngle(180f);
        arc3.setLength(this.getLen());
        arc3.setFill(null);
        arc3.setType(ArcType.OPEN);

        Arc arc4 = new Arc();
        arc4.setCenterX(this.getCx());
        arc4.setCenterY(this.getCy());
        arc4.setRadiusX(this.getLen());
        arc4.setRadiusY(this.getLen());
        arc4.setStrokeWidth(this.getWidth());
        arc4.setStroke(Color.GREEN);
        arc4.setStartAngle(270f);
        arc4.setLength(this.getLen());
        arc4.setFill(null);
        arc4.setType(ArcType.OPEN);

        //Group cir = new Group(arc1, arc2, arc3, arc4);
        this.group = new Group(arc1, arc2, arc3, arc4);
        return group;

    }
}