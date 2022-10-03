package se.albin.m4;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

import javax.swing.ImageIcon;

import se.egy.graphics.GameScreen;
import se.egy.graphics.ImgContainer;

public class Game implements KeyListener {

	private HashMap<String, Boolean> keyDown = new HashMap<>();

	private boolean gameRunning = true;
	private Entity player;
	
	

	private GameScreen gameScreen = new GameScreen("Game", 1400, 800, false); // false vid testkörning

	public Game() {
		gameScreen.setKeyListener(this);

		keyDown.put("left", false);
		keyDown.put("right", false);
		keyDown.put("down", false);
		keyDown.put("up", false);

		loadImages();
		gameLoop();
	}

	public void loadImages() {
		Image img = new ImageIcon(getClass().getResource("/playerImg.png")).getImage();
		player = new Entity(img, 384, 284);
		gameScreen.setBackground("/night_sky.png");
	}

	public void update() {
		if (keyDown.get("right") && player.getX() < gameScreen.getWidth() - player.getWidth() - 5)
			player.setX(player.getX() + 5);
		if (keyDown.get("left") && player.getX() > 5)
			player.setX(player.getX() - 5);
		if (keyDown.get("up") && player.getY() > 5)
			player.setY(player.getY() - 5);
		if (keyDown.get("down") && player.getY() < gameScreen.getHeight() - player.getWidth() - 5)
			player.setY(player.getY() + 5);

	}

	public void render() {
		gameScreen.render(player);
	}

	public void gameLoop() {
		while (gameRunning) {
			update();
			render();
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
		else if (key == KeyEvent.VK_DOWN)
			keyDown.put("down", true);
		else if (key == KeyEvent.VK_UP)
			keyDown.put("up", true);

	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT)
			keyDown.put("left", false);
		else if (key == KeyEvent.VK_RIGHT)
			keyDown.put("right", false);
		else if (key == KeyEvent.VK_DOWN)
			keyDown.put("down", false);
		else if (key == KeyEvent.VK_UP)
			keyDown.put("up", false);

		if (key == KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		new Game();
	}

}
