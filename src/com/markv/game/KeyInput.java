package com.markv.game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

	private Handler handler;
	
	public KeyInput(Handler handler) {
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		GameObject tempObject;
		try {
			tempObject = handler.getGameObjectByID(ID.Player);
			if(key == KeyEvent.VK_W) tempObject.setVelY(-5);
			if(key == KeyEvent.VK_S) tempObject.setVelY(5);
			if(key == KeyEvent.VK_D) tempObject.setVelX(5);
			if(key == KeyEvent.VK_A) tempObject.setVelX(-5);
		} catch (Exception e1) {}

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
