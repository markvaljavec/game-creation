package com.markv.game;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas {

	private static final long serialVersionUID = 4540726540069821934L;
	
	public Window(int width, int height, String title, Game game) {
		JFrame frame = new JFrame(title); //craetes and instance of an object of a window/frame
		
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //without this the window might not close properly
		frame.setResizable(false); //cannot resize
		frame.setLocationRelativeTo(null);
		frame.add(game);
		frame.setVisible(true);
		game.start();
	}
	
}
