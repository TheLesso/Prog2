package se.albin.m3;

import java.awt.Color;
import java.awt.Graphics2D;

import se.egy.graphics.Drawable;

public class Circle implements Drawable {
	private int xPos, yPos;
	private int width;
	private int height;
	private Color color;

	public Circle(int width, int height, int xPos, int yPos, Color color) {
		this.width = width;
		this.height = height;
		this.xPos = xPos;
		this.yPos = yPos;
		this.color = color;
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(color);
		g.fillOval(xPos, yPos, width, height);

	}

}
