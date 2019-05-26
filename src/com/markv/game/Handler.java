package com.markv.game;

import java.awt.Graphics;
import java.util.LinkedList;

import javax.lang.model.UnknownEntityException;

public class Handler {

	private LinkedList<GameObject> objects = new LinkedList<GameObject>();
	public void tick() {
		for(int i = 0; i < objects.size(); i++) {
			GameObject tempObject = objects.get(i);
			
			tempObject.tick();
		}
	}
	
	public void render(Graphics g) {
		for(int i = 0; i < objects.size(); i++) {
			GameObject tempObject = objects.get(i);
			
			tempObject.render(g);
		}
	}
	
	public void addObject(GameObject object) {
		this.objects.add(object);
	}
	
	public void removeObject(GameObject object) {
		this.objects.remove(object);
	}
	public GameObject getGameObjectByID(ID id) throws Exception {
		for(int i = 0; i < this.objects.size(); i++) {
			if(objects.get(i).getID() == id) {
				return objects.get(i);
			}
		}
		throw new Exception("No such id.");
	}
}

