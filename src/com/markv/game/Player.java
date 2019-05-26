package com.markv.game;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject {

	int size;
	public int health;
	public Player(int x, int y, int size) {
		super(x, y, ID.Player);
		this.size = size;
		this.health = 100;
	}

	@Override
	public void tick() {
		x += velX;
		y += velY;
		
		//My version of collision with a wall
		x = (int) Game.clamp(x, 0, Game.WIDTH - this.size - 6);
		y = (int) Game.clamp(y, 0, Game.HEIGHT - this.size - 35);
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, size, size);
		
	}
	
	//His version of collision with a wall
}
