package se.albin.m5;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

import javax.swing.ImageIcon;

import se.egy.graphics.GameScreen;
import se.egy.graphics.ImgContainer;

public class Game2 implements KeyListener {

	private HashMap<String, Boolean> keyDown = new HashMap<>();

	private boolean gameRunning = true;
	private ShipEntity player;

	private GameScreen gameScreen = new GameScreen("Game", 1400, 900, false); // false vid testkörning

	public Game2() {
		gameScreen.setKeyListener(this);

		keyDown.put("left", false);
		keyDown.put("right", false);
		keyDown.put("down", false);
		keyDown.put("up", false);

		loadImages();
		gameLoop();
	}

	public void loadImages() {
		Image img = new ImageIcon(getClass().getResource("/ship.png")).getImage();
		player = new ShipEntity(img, 40, 40, 5);
	}

	public void update() {
		if (keyDown.get("right") && player.getX() < gameScreen.getWidth() - player.getWidth() - 5)
			player.setDirectionX(1);
		else if (keyDown.get("left") && player.getX() > 5)
			player.setDirectionX(-1);
		else player.setDirectionX(0);
	}

	public void render() {
		gameScreen.render(player);
	}

	public void gameLoop() {
		while (gameRunning) {
			update();
			render();
			player.move();
			// Fördröjning
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}
	}

	/** Spelets tangentbordslyssnare */
	public void keyTyped(KeyEvent e) {

	}

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

		if (key == KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		new Game2();
	}

}
