package se.albin.m6;

import java.awt.Image;

public class AlienEntity extends Entity {

	public AlienEntity(Image image, double xPos, double yPos, int speed) {
		super(image, xPos, yPos, speed);
		dy = 1;
		dx = 0;
	}

	public void move(long deltaTime) {
		yPos += dy * (deltaTime / 1000000000.0) * speed;
	}

}
