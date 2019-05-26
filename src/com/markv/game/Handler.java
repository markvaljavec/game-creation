package com.markv.game;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {

	private LinkedList<GameObject> objects = new LinkedList<GameObject>();

	public void tick() {
		objects.forEach((tempObject) -> tempObject.tick());
	}

	public void render(Graphics g) {
		objects.forEach((tempObject) -> tempObject.render(g));
	}

	public void addObject(GameObject object) {
		this.objects.add(object);
	}

	public boolean removeObject(GameObject object) {
		return this.objects.remove(object);
	}

	public GameObject getGameObjectByID(ID id) {
		for (int i = 0; i < this.objects.size(); i++) {
			if (objects.get(i).getID() == id) {
				return objects.get(i);
			}
		}
		return null;
	}

	public boolean removeObjectByID(ID id) {
		return this.removeObject(this.getGameObjectByID(id));

	}
}
