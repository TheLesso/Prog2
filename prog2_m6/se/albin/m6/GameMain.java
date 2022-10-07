package se.albin.m6;

import java.awt.Image;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import se.egy.graphics.*;

public class GameMain implements KeyListener {

	private boolean gameRunning = true;
	private long lastUpdateTime;

	private HashMap<String, Boolean> keyDown = new HashMap<>();
	private ArrayList<Entity> spriteList = new ArrayList<>();

	private GameScreen gameScreen = new GameScreen("Game", 800, 600, false);

	Image shipImg = new ImageIcon(getClass().getResource("/ship.png")).getImage();
	Image AlienImg = new ImageIcon(getClass().getResource("/playerImg.png")).getImage();

	public GameMain() {
		gameScreen.setKeyListener(this);

		keyDown.put("left", false);
		keyDown.put("right", false);
		loadImages();
		gameLoop();
	}

	public void loadImages() {

		double x = (gameScreen.getWidth() - shipImg.getWidth(null)) / 2;
		double y = gameScreen.getHeight() - shipImg.getHeight(null) - 10;

		spriteList.add(new ShipEntity(shipImg, x, y, 30));
	}

	public void update(long deltaTime) {
		if (keyDown.get("right") && ship.getX() < gameScreen.getWidth() - shipImg.getWidth(null) - 10)
			ship.setDirectionX(1);
		else if (keyDown.get("left") && ship.getX() > 10)
			ship.setDirectionX(-1);
		else
			ship.setDirectionX(0);

		ship.move(deltaTime);
	}

	public void render() {
		gameScreen.render(ship);
	}

	public void gameLoop() {
		/** Läser av systemtiden i nanosekunder */
		lastUpdateTime = System.nanoTime();

		while (gameRunning) {
			/** Tiden som gått sedan senaste uppdateringen */
			long deltaTime = System.nanoTime() - lastUpdateTime;
			lastUpdateTime = System.nanoTime();

			update(deltaTime);
			render();
		}
	}

	/** Spelets tangentbordslyssnare */
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT)
			keyDown.put("left", true);
		else if (key == KeyEvent.VK_RIGHT)
			keyDown.put("right", true);
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT)
			keyDown.put("left", false);
		else if (key == KeyEvent.VK_RIGHT)
			keyDown.put("right", false);
	}

	public void keyTyped(KeyEvent e) {
	}

	public static void main(String[] args) {
		new GameMain();
	}
}
