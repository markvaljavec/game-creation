package com.markv.game;

public abstract class GameObject {
	float x;
	float y;
	abstract void render();
	abstract void tick();
	abstract float getX();
	abstract float getY();
	abstract GameObjectID getID();
}

enum GameObjectID{
	Player(),
	Enemy();
}
