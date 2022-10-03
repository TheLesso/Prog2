package se.albin.m4;

import java.awt.Graphics2D;
import java.awt.Image;

import se.egy.graphics.Drawable;

public class Entity implements Drawable {

	private Image img;
	private double x;
	private double y;

	
	
	public Entity(Image img, double x, double y) {
		this.x = x;
		this.y = y;
		this.img = img;
	}

	public double getX() {
		return x;
	}

	public void setX(double newX) {
		this.x = newX;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		this.y = newY;
	}

	@Override
	public void draw(Graphics2D g) {
		g.drawImage(img, (int)x, (int)y, null);
	}

	public int getWidth() {
		return img.getWidth(null);
	}

}
