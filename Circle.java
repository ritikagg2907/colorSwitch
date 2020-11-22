package colorSwitch;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class Circle extends Obstacles{
	
	private float CX;
	private float CY;
	private float len;
	private float width;

	public Group Circles() {

		Arc arc1 = new Arc();
		arc1.setCenterX(CX);
		arc1.setCenterY(CY);
		arc1.setRadiusX(len);
		arc1.setRadiusY(len);
		arc1.setStrokeWidth(width);
		arc1.setStroke(Color.PURPLE);
		arc1.setStartAngle(0f);
		arc1.setLength(len);
		arc1.setFill(null);
		arc1.setType(ArcType.OPEN);
		
		Arc arc2 = new Arc();
		arc2.setCenterX(CX);
		arc2.setCenterY(CY);
		arc2.setRadiusX(len);
		arc2.setRadiusY(len);
		arc2.setStrokeWidth(width);
		arc2.setStroke(Color.BLUE);
		arc2.setStartAngle(90f);
		arc2.setLength(len);
		arc2.setFill(null);
		arc2.setType(ArcType.OPEN);
		
		Arc arc3 = new Arc();
		arc3.setCenterX(CX);
		arc3.setCenterY(CY);
		arc3.setRadiusX(len);
		arc3.setRadiusY(len);
		arc3.setStrokeWidth(width);
		arc3.setStroke(Color.RED);
		arc3.setStartAngle(180f);
		arc3.setLength(len);
		arc3.setFill(null);
		arc3.setType(ArcType.OPEN);
		
		Arc arc4 = new Arc();
		arc4.setCenterX(CX);
		arc4.setCenterY(CY);
		arc4.setRadiusX(len);
		arc4.setRadiusY(len);
		arc4.setStrokeWidth(width);
		arc4.setStroke(Color.GREEN);
		arc4.setStartAngle(270f);
		arc4.setLength(len);
		arc4.setFill(null);
		arc4.setType(ArcType.OPEN);
		
		Group cir = new Group(arc1, arc2, arc3, arc4);
		return cir;
		
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
