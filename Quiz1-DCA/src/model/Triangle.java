package model;

import processing.core.PApplet;

public class Triangle extends Figure {

	protected int posX2, posX3;
	protected int posY2, posY3;
	
	public Triangle(int tam, int posX, int posY, int direction, int r, int g, int b, PApplet app) {
		super(tam, posX, posY, direction, r, g, b, app);
	}

	@Override
	protected void drawFigure() {
		app.fill(r,g,b);
		app.triangle(posX, posY, posX2, posY2, posX3, posY3);
	}

}
