package colorSwitch;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;

public class Cross extends Obstacles{
	
	private float CX;
	private float CY;
	private float len;
	private float width;
	
	public Group Cross(){
		
		Line l1 = new Line();
		l1.setStartX(CX);
		l1.setStartY(CY);
		l1.setEndX(CX-len);
		l1.setEndY(CY-len);
		l1.setStrokeWidth(width);
		l1.setStroke(Color.GREEN);
		l1.setStrokeLineCap(StrokeLineCap.ROUND);
		
		Line l2 = new Line();
		l2.setStartX(CX);
		l2.setStartY(CY);
		l2.setEndX(CX+len);
		l2.setEndY(CY+len);
		l2.setStrokeWidth(width);
		l2.setStroke(Color.RED);
		l2.setStrokeLineCap(StrokeLineCap.ROUND);
		
		Line l3 = new Line();
		l3.setStartX(CX);
		l3.setStartY(CY);
		l3.setEndX(CX-len);
		l3.setEndY(CY+len);
		l3.setStrokeWidth(width);
		l3.setStroke(Color.BLUE);
		l3.setStrokeLineCap(StrokeLineCap.ROUND);
		
		Line l4 = new Line();
		l4.setStartX(CX);
		l4.setStartY(CY);
		l4.setEndX(CX+len);
		l4.setEndY(CY-len);
		l4.setStrokeWidth(width);
		l4.setStroke(Color.WHITE);
		l4.setStrokeLineCap(StrokeLineCap.ROUND);
		
		Group tri = new Group(l1,l2,l3,l4);
		return tri;
	}

	@Override
	public void setCentreX(float x) {
		this.CX = x;
		
	}

	@Override
	public void setCentreY(float y) {
		this.CY = y;
		
	}

	@Override
	public void setLength(float length) {
		this.len = length;
		
	}

	@Override
	public void setStrokeWidth(float width) {
		this.width = width;
		
	}

}
