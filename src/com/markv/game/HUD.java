package com.markv.game;

import java.awt.Color;
import java.awt.Graphics;

public class HUD {

	private Handler handler;
	PlayerHealthBar playerHealthBar;
	
	public HUD(Handler h) {
		this.handler = h;
		this.playerHealthBar = new PlayerHealthBar();
	}

	public void tick() {
		playerHealthBar.tick();
	}

	public void render(Graphics g) {
		playerHealthBar.render(g);
	}

	abstract class Bar {
		int x, y, width, height;
		int maxValue;

		public Bar(int x, int y, int w, int h, int maxV) {
			this.x = x;
			this.y = y;
			this.width = w;
			this.height = h;
			this.maxValue = maxV;
		}

		abstract void tick();

		abstract void render(Graphics g);
	}

	class PlayerHealthBar extends Bar {
		Player p;
		float fraction;

		public PlayerHealthBar() {
			super(3, 3, 200, 25, 100);
			try {
				this.p = (Player) handler.getGameObjectByID(ID.Player);
			} catch (Exception e) {
			}
		}

		@Override
		void render(Graphics g) {
			g.setColor(Color.gray);
			g.fillRect(x,y,width,height);
			g.setColor(Color.green);
			g.fillRect(x,y,(int) (width*fraction),height);
		}

		@Override
		void tick() {
			this.fraction = Game.clamp((float) p.health / this.maxValue, 0f, 1f);
		}

	}
}
