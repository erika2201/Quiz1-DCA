package controller;

import model.Logic;

public class Controller {

	Logic logic;
	
	public Controller() {
		logic = new Logic();
	}
	
	public void drawCircle() {
		logic.drawCircle();
	}
	
	public void drawSquare() {
		logic.drawSquare();
	}
	
	public void drawTriangle() {
		logic.drawTriangle();
	}
}
