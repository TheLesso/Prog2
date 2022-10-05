package se.albin.m5;

import java.awt.Color;
import java.awt.Graphics2D;


public class Ellipse extends Shape {
 	private int height;
 	private int width;
 	
 	/** Konstruktor */
 	public Ellipse(int height, int width, int xPos, int yPos, Color color) {
    	   super(xPos, yPos, color); // anropar Shapes konstruktor
    	   this.width = width;
    	   this.height = height;
 	}
 
 	public void draw(Graphics2D g) {
    	   g.setColor(super.getColor());
    	   g.fillOval(super.getxPos(), super.getyPos(), width, height);
 	}
 
 	public int getArea() {
    	   int area = (int) (Math.PI*(width/2)*(height/2));
    	   return area;
 	}

      public int getOmk() {
    	   int omk = (int) (Math.PI*(Math.sqrt(2*Math.pow(width,2) + 2*Math.pow(height, 2))));
    	   return omk;
 	}

	

}


