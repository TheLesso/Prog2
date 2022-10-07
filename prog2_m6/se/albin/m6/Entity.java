package se.albin.m6;

import java.awt.Graphics2D;
import java.awt.Image;

import se.egy.graphics.Drawable;
import se.egy.graphics.ImgContainer;

public abstract class Entity implements Drawable {
    private Image image;
    protected double xPos, yPos;   // Positionen
    protected int speed;           // Hastighet i px/sekund
    protected int dx = 0, dy = 0;  // Rörelseriktning
    private boolean active = true; // Gör alla nya objekt aktiva.
   
    /**
     * Konstruktor
     */
    public Entity (Image image, double xPos, double yPos, int speed){
     	this.image = image;   
     	this.xPos = xPos;
     	this.yPos = yPos;
     	this.speed = speed;
    }
   
    /**
     * Ritar bilden på ytan g
     */
    public void draw(Graphics2D g) {
     	g.drawImage(image,(int)xPos,(int)yPos,null);
    }
   
    /**
     * Vilken riktning i x-led
     * @param dx 0 = stilla, 1 = höger, -1 = vänster
     */
    public void setDirectionX(int dx){
     	this.dx = dx;
    }
   
    /**
     * Vilken riktning i y-led
     * @param dy 0 = stilla, 1 = höger, -1 = vänster
     */
    public void setDirectionY(int dy){
     	this.dy = dy;
    }
    
    public double getX() {
		return xPos;
    }
   
    /**
     * Metod som gör förflyttningen, dvs ändrar xPos och yPos
     * Måste skapas i klasser som ärver entity
     * @param antal nanosekunder sedan förra anropet 
     */
    public abstract void move(long deltaTime);
}

