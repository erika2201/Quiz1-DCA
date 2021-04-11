package model;

import processing.core.PApplet;

public class Square extends Figure {

	public Square(int tam, int posX, int posY, int direction, int r, int g, int b, PApplet app) {
		super(tam, posX, posY, direction, r, g, b, app);
	}

	@Override
	protected void drawFigure() {
		app.fill(r,g,b);
		app.rect(posX, posY, tam, tam);

	}

}
