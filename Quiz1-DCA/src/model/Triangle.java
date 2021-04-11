package model;

import processing.core.PApplet;

public class Triangle extends Figure {

	public Triangle(int tam, int posX, int posY, int direction, int r, int g, int b, PApplet app) {
		super(tam, posX, posY, direction, r, g, b, app);
	}

	@Override
	protected void drawFigure() {
		app.fill(r,g,b);		
		app.triangle(getPosX() - getTam() / 2, 		getPosY() + getTam() / 2, //PosX and PosY 1
					getPosX(), 						getPosY() - getTam() / 2, //PosX and PosY 2
					getPosX() + getTam() / 2, 		getPosY()+getTam()/2);	  //PosX and PosY 3
	}

}