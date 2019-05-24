package com.markv.game;

import java.awt.Canvas;

public class Game extends Canvas {
	
	private static final long serialVersionUID = -197048722577070546L;
	
	public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
	
	public Game() {
		new Window(WIDTH, HEIGHT, "Superior game belonging to Mark", this);
	}
	
	public synchronized void start() {
		
	}
	
	public void run() {
		
	}
	
	public static void main(String[] args) {
		
		new Game();
		
	}
}
