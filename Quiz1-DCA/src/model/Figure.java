package model;

import processing.core.PApplet;

public abstract class Figure extends PApplet {
	
	PApplet app;
	protected int posX;
	protected int posY;
	protected int tam;
	protected int direction;
	
	protected int r,g,b;
	
	public Figure(int tam, int posX, int posY, int direction, int r, int g, int b, PApplet app) {
		
		this.tam=tam;
		this.posX=posX;
		this.posY=posY;
		this.direction=direction;
		this.app=app;
		
		this.r = r;
		this.g = g;
		this.b = b;

	}
	
	protected abstract void drawFigure();
	//abstract because each figure is drawn with different methods
	
	protected void move() {
		posY += direction* 4;
		
		if (posY + tam/2 <= 19 || posY + (tam/2) >= 580) {
			direction = direction *(-1); //change direction (rebound)
	
		}
	}
}