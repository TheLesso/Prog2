package se.albin.m5;

import java.awt.Color;


public class Circle extends Ellipse{
 	/** Konstruktor */
 	public Circle(int diameter, int xPos, int yPos, Color color) {
    	   super(diameter, diameter, xPos, yPos, color); // anropar Shapes konstruktor
 	}
}

