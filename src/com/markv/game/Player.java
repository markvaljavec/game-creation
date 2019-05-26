package com.markv.game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Player extends GameObject {

	Random r = new Random();
	
	public Player(int x, int y, ID id) {
		super(x, y, id);
		
	}

	@Override
	public void tick() {
		x += velX;
		y += velY;
		
		
		//My version of collision with a wall
		if(x > Game.WIDTH-32) x = Game.WIDTH-32;
		if(x < 0) x = 0;
		if(y > Game.HEIGHT-48) y = Game.HEIGHT-48;
		if(y < 0) y = 0;
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
		
	}
	
	//His version of collision with a wall
	
}
