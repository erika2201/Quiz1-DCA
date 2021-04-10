package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic extends PApplet {
	
	PApplet app;
	Figure circle;
	Figure square;
	Figure triangle;
	
	String [] cartarTXT;
	ArrayList <String> words;
	ArrayList<Figure> figure;
	
	public Logic() {
		cartarTXT = app.loadStrings("../data/TXT.txt");
		words = new ArrayList<String>();
		figure = new ArrayList<Figure>();
		
		circle = new Circle(50, 50, 50, 1, 255, 0, 255, app);
		square = new Square(50, 50, 50, 1, 255, 0, 255, app);
	}
	
	public void drawCircle() {
		circle.drawFigure();
	}
	
	public void drawSquare() {
		square.drawFigure();
	}
	
	public void drawTriangle() {
		square.drawFigure();
	}

}
