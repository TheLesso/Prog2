package se.albin.m3;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import se.egy.graphics.Drawable;
import se.egy.graphics.GameScreen;

public class Rectangle2 implements Drawable {

	private int width;
	private int height;
	private int xPos, yPos;
	private Color color;

	/**
	 * Konstruktor
	 */
	public Rectangle2(int width, int heigth, int xPos, int yPos, Color color) {
		this.width = width;
		this.height = heigth;
		this.xPos = xPos;
		this.yPos = yPos;
		this.color = color;
	}


	public void draw(Graphics2D g) {
		g.setColor(color);
		g.fillRect(xPos, yPos, width, height);
	}
	
	public int getX() {
		return xPos;
	}
	
	public void setX(int newX) {
		this.xPos = newX;
	}
	
	public int getY() {
		return yPos;
	}
	
	public void setY(int newY) {
		this.yPos = newY;
	}
}
