package model;

import processing.core.PApplet;

public class Triangle extends Figure {

	public Triangle(int tam, int posx, int posy, int direction, int r, int g, int b, PApplet app) {
		super(tam, posx, posy, direction, r, g, b, app);
	}

	@Override
	protected void drawFigure() {
		app.fill(r,g,b);
		app.triangle(posX, posY, posX, posY, posX, posY);
	}

}
