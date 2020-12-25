package colorSwitch;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;

public class Rectangle extends Obstacles{
    protected Group group;


    public Rectangle(float cx, float cy, float len, float width){
        this.setCx(cx);
        this.setCy(cy);
        this.setLen(len);
        this.setWidth(width);
        this.createObstacle();

    }


    @Override
    public Group createObstacle() {
        Line l1 = new Line();
        l1.setStartX(this.getCx());
        l1.setStartY(this.getCy());
        l1.setStrokeWidth(this.getWidth());
        l1.setEndX(this.getCx()+this.getLen());
        l1.setEndY(this.getCy());
        l1.setStroke(Color.BLUE);
        l1.setStrokeLineCap(StrokeLineCap.ROUND);

        Line l2 = new Line();
        l2.setStartX(this.getCx());
        l2.setStartY(this.getCy());
        l2.setStrokeWidth(this.getWidth());
        l2.setEndX(this.getCx());
        l2.setEndY(this.getCy()+this.getLen());
        l2.setStroke(Color.RED);
        l2.setStrokeLineCap(StrokeLineCap.ROUND);

        Line l3 = new Line();
        l3.setStartX(this.getCx()+this.getLen());
        l3.setStartY(this.getCy());
        l3.setStrokeWidth(this.getWidth());
        l3.setEndX(this.getCx()+this.getLen());
        l3.setEndY(this.getCy()+this.getLen());
        l3.setStroke(Color.GREEN);
        l3.setStrokeLineCap(StrokeLineCap.ROUND);

        Line l4 = new Line();
        l4.setStartX(this.getCx());
        l4.setStartY(this.getCy()+this.getLen());
        l4.setStrokeWidth(this.getWidth());
        l4.setEndX(this.getCx()+this.getLen());
        l4.setEndY(this.getCy()+this.getLen());
        l4.setStroke(Color.PURPLE);
        l4.setStrokeLineCap(StrokeLineCap.ROUND);

        this.group = new Group(l1,l2,l3,l4);
        return this.group;
    }
}