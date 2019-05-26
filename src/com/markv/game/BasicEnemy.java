package com.markv.game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class BasicEnemy extends GameObject{
	public BasicEnemy(Random r) {
		super(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BasicEnemy);
		velX = 5;
		velY = 5;
	}
	
	public void tick() {
		x += velX;
		y += velY;
		
		if(y <= 0 || y >= Game.HEIGHT-48) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH-24) velX *= -1;
	}
	
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, 16, 16);
	}
}
