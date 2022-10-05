package se.albin.m5;

import java.awt.Color;
import se.egy.graphics.GameScreen;

public class ShapeTest {
	 
	   public static void main(String[] args) {
	    	GameScreen gs = new GameScreen("Rektanglar", 800, 600, false);
	    	
	    	Shape[] shapeArray = new Shape[5];
	    	
	    	// POLYMORFISM, olika klasser kan läggas till i samma array
	    	shapeArray[0] = new Rectangle(30, 50, 10, 10, Color.pink);
	    	shapeArray[1] = new Square(60, 80, 10, Color. green);
	    	shapeArray[2] = new Circle(100, 100, 100, Color.yellow);
	    	shapeArray[3] = new Ellipse(60, 150, 300, 10, Color.red);
	    	shapeArray[4] = new Circle(50, 300, 300, Color.blue);
	    	
	    	// Skriver ut i konsolen
	    	for(int i = 0; i < shapeArray.length; i++){ 	
	         // DYNAMISK BINDNING, de olika objekten utför metoden
	         // getArea, getOmk olika beroende på vilken klass den tillhör.
	         int area = shapeArray[i].getArea();
	         int omk = shapeArray[i].getOmk();
	        	
	         System.out.println("Arean = " + area);
	         System.out.println("Omkretsen = " + omk);
	    	}
	    	
	    	gs.render(shapeArray);
	   }
}
