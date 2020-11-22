package colorSwitch;

import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.Group;

public abstract class Obstacles {
	

	public Obstacles() {
		
	}
	
	public abstract void setCentreX(float x);
	public abstract void setCentreY(float y);
	public abstract void setLength(float length);
	public abstract void setStrokeWidth(float width);
	
}
