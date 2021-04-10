package model;

import processing.core.PApplet;

public abstract class Figure extends PApplet {
	
	PApplet app;
	protected int posX;
	protected int posY;
	protected int tam;
	protected int directionX;
	protected int directionY;
	
	protected int r,g,b;
	
	public Figure(int tam, int posx, int posy, int directionX, int directionY, int r, int g, int b, PApplet app) {
		
		this.tam=tam;
		this.posX=posx;
		this.posY=posy;
		this.directionX=directionX;
		this.directionY=directionY;
		this.app=app;
		
		this.r = r;
		this.g = g;
		this.b = b;

	}
	
	protected abstract void drawFigure();
	//abstract because each figure is drawn with different methods
	
	protected void move() {
		
		
	}
	
}