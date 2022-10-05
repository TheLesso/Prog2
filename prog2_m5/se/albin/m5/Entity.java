package se.albin.m5;

import java.awt.Graphics2D;
import java.awt.Image;

import se.egy.graphics.Drawable;

public abstract class Entity implements Drawable {

	private Image img;
	protected double x;
	private double y;
	protected int speed;
	protected int dx = 0;
	private int dy = 0;;
	private boolean active = true;

	public Entity(Image img, double x, double y, int speed) {
		this.x = x;
		this.y = y;
		this.img = img;
		this.speed = speed;
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
	
	public boolean getActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public void setDirectionX(int dx) {
		this.dx = dx;
	}
	
	public void setDirectionY(int dy) {
		this.dy = dy;
	}
	
	public abstract void move();

	@Override
	public void draw(Graphics2D g) {
		g.drawImage(img, (int) x, (int) y, null);
	}

	public int getWidth() {
		return img.getWidth(null);
	}

}
