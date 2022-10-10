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
	int alienCount = 3;
	int alienSpeed = 20;

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

		double shipX = (gameScreen.getWidth() - shipImg.getWidth(null)) / 2;
		double shipY = gameScreen.getHeight() - shipImg.getHeight(null) - 10;

		spriteList.add(new ShipEntity(shipImg, shipX, shipY, 100));

		int alienX = ((gameScreen.getWidth() - AlienImg.getWidth(null)) / 2) / alienCount;
		int xSpacing = alienX * 2;

		for (int i = 0; i < alienCount; i++) {
			spriteList.add(new AlienEntity(AlienImg, alienX, 50, alienSpeed));
			alienX += xSpacing;
		}
	}

	public void update(long deltaTime) {

		if (keyDown.get("right") && spriteList.get(0).getX() < gameScreen.getWidth() - shipImg.getWidth(null) - 10)
			spriteList.get(0).setDirectionX(1);
		else if (keyDown.get("left") && spriteList.get(0).getX() > 10)
			spriteList.get(0).setDirectionX(-1);
		else
			spriteList.get(0).setDirectionX(0);

		for (int i = 0; i < spriteList.size(); i++) {

			if (spriteList.get(i).getY() > (gameScreen.getHeight() - AlienImg.getHeight(null) - 10)) {
				gameRunning = false;
				break;
			}
			spriteList.get(i).move(deltaTime);
		}

	}

	public void render() {
		gameScreen.render(spriteList);
	}

	public void gameLoop() {
		int fps = 30;
		int updateTime = (int) (1.0 / fps * 1000000000.0);

		lastUpdateTime = System.nanoTime();

		while (gameRunning) {
			long deltaTime = System.nanoTime() - lastUpdateTime;

			if (deltaTime > updateTime) {
				lastUpdateTime = System.nanoTime();
				update(deltaTime);
				render();
			}
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
