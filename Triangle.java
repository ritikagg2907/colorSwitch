package colorSwitch;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;

public class Triangle extends Obstacles{
	
	private float CX;
	private float CY;
	private float len;
	private float width;
	
	public  void setCentreX(float x) {
		this.CX = x;
	}
	public  void setCentreY(float y)
	{
		this.CY= y;
	}
	public  void setLength(float length) {
		this.len = length;
	}
	public  void setStrokeWidth(float width) {
		this.width = width;
	}
	
	public Group Triangle(){
		
		Line l1 = new Line();
		l1.setStartX(CX);
		l1.setStartY(CY);
		l1.setEndX(CX-len/2);
		l1.setEndY(CY-(1/2)*Math.sqrt(3)*len);
		l1.setStrokeWidth(width);
		l1.setStroke(Color.GREEN);
		l1.setStrokeLineCap(StrokeLineCap.ROUND);
		
		Line l2 = new Line();
		l2.setStartX(CX);
		l2.setStartY(CY);
		l2.setEndX(CX+len/2);
		l2.setEndY(CY-(1/2)*Math.sqrt(3)*len);
		l2.setStrokeWidth(width);
		l2.setStroke(Color.RED);
		l2.setStrokeLineCap(StrokeLineCap.ROUND);
		
		Line l3 = new Line();
		l3.setStartX(CX-len/2);
		l3.setStartY(CY-(1/2)*Math.sqrt(3)*len);
		l3.setEndX(CX+len/2);
		l3.setEndY(CY-(1/2)*Math.sqrt(3)*len);
		l3.setStrokeWidth(width);
		l3.setStroke(Color.BLUE);
		l3.setStrokeLineCap(StrokeLineCap.ROUND);
		
		Group tri = new Group(l1,l2,l3);
		return tri;
	}

	@Override
	public Group createObstacle() {
		// TODO Auto-generated method stub
		return null;
	}

}
