package model;

import processing.core.PApplet;

public class Circle extends Figure {

	public Circle(int tam, int posx, int posy, int direction, int r, int g, int b, PApplet app) {
		super(tam, posx, posy, direction, r, g, b, app);
	}

	@Override
	protected void drawFigure() {
		app.fill(r,g,b);
		app.ellipse(posX, posY, tam, tam);
	}

}
