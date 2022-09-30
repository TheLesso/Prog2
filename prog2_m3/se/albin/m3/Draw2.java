package se.albin.m3;

import java.awt.Color;
import java.util.Random;

import se.egy.graphics.Drawable;
import se.egy.graphics.GameScreen;

public class Draw2 {
	public static void main(String[] args) {
		GameScreen gs = new GameScreen("Rektanglar", 1000, 800, false);

		Rectangle2[] rec = new Rectangle2[5];
		Circle[] circ = new Circle[5];
		Drawable[] shapeArray = new Drawable[4];
		Random random;
		random = new Random();

		rec[0] = new Rectangle2(200, 100, 50, 50, Color.green);
		rec[1] = new Rectangle2(200, 100, 50, 200, Color.red);
		rec[2] = new Rectangle2(200, 100, 50, 350, Color.gray);
		rec[3] = new Rectangle2(200, 100, 50, 500, Color.blue);
		rec[4] = new Rectangle2(200, 100, 50, 650, Color.yellow);

		circ[0] = new Circle(100, 100, 500, 50, Color.green);
		circ[1] = new Circle(100, 100, 500, 200, Color.red);
		circ[2] = new Circle(100, 100, 500, 350, Color.gray);
		circ[3] = new Circle(100, 100, 500, 500, Color.blue);
		circ[4] = new Circle(100, 100, 500, 650, Color.yellow);
		
		shapeArray[0] = new Circle(100, 100, 500, 50, Color.green);
		shapeArray[1] = new Circle(100, 100, 500, 200, Color.red);
		shapeArray[2] = new Rectangle2(200, 100, 50, 50, Color.gray);
		shapeArray[3] = new Rectangle2(200, 100, 50, 200, Color.blue);
		
		
		while(true) {
		gs.render(rec);
		try{ Thread.sleep(5);}catch(Exception e){}
		for(int i = 0; i<rec.length; i++) {
			rec[i].setX(rec[i].getX()+random.nextInt(10));	
		}	
		}
		
	}
}
