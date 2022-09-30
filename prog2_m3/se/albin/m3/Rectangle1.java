package se.albin.m3;

import java.awt.*;

import se.egy.graphics.Drawable;
import se.egy.graphics.GameScreen;

public class Rectangle1 implements Drawable {
	
	private int width;
    private int height;
    private int xPos, yPos;
    private Color color;
    
    /**
     * Konstruktor
     */
    public Rectangle1(int width, int heigth, int xPos, int yPos, Color color){
          this.width = width;
          this.height = heigth;
          this.xPos = xPos;
          this.yPos = yPos;
          this.color = color;
    }


	public static void main(String[] args) {
		GameScreen gs = new GameScreen("Rektanglar", 800, 600, false);

		Rectangle1 rect = new Rectangle1(100, 300, 50, 70, Color.green);

		gs.render(rect);
	}
	
	public void draw(Graphics2D g) {
		g.setColor(color);
		g.fillRect(xPos, yPos, width, height);
	}
}


