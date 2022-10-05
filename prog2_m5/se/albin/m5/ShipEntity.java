package se.albin.m5;

import java.awt.Image;

public class ShipEntity extends Entity {
	
	public ShipEntity (Image image, double xPos, double yPos, int speed) {
		super(image, xPos, yPos, speed);
	}

	public void move() {
		x += dx*speed;
	}

	
}
