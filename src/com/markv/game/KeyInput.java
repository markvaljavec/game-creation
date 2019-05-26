package com.markv.game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
	private final int SPEED = 5;
	private Handler handler;
	
	public KeyInput(Handler handler) {
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		GameObject tempObject;
		try {
			tempObject = (Player) handler.getGameObjectByID(ID.Player);
			if(key == KeyEvent.VK_W) tempObject.setVelY(-SPEED);
			if(key == KeyEvent.VK_S) tempObject.setVelY(SPEED);
			if(key == KeyEvent.VK_D) tempObject.setVelX(SPEED);
			if(key == KeyEvent.VK_A) tempObject.setVelX(-SPEED);
			if(key == KeyEvent.VK_SPACE) ((Player) tempObject).health-=10; 
			if(key == KeyEvent.VK_SPACE) handler.removeObjectByID(ID.BasicEnemy);
		} catch (Exception e1) {}
		
		if(key == KeyEvent.VK_ESCAPE) System.exit(0);

	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		GameObject tempObject;
		try {
			tempObject = handler.getGameObjectByID(ID.Player);
			if(key == KeyEvent.VK_W) tempObject.setVelY(0);
			if(key == KeyEvent.VK_S) tempObject.setVelY(0);
			if(key == KeyEvent.VK_D) tempObject.setVelX(0);
			if(key == KeyEvent.VK_A) tempObject.setVelX(0);
		} catch (Exception e1) {}
		
	}
	
}
