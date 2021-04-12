package model;

import processing.core.PApplet;

public abstract class Figure extends PApplet {
	
	PApplet app;
	protected int posX;
	protected int posY;
	protected int tam;
	protected int direction;
	protected int value;
	
	protected int r,g,b;
	
	private boolean isMov;
	
	public Figure(int tam, int posX, int posY, int direction, int r, int g, int b, int value, PApplet app) {
		
		this.tam=tam;
		this.posX=posX;
		this.posY=posY;
		this.direction=direction;
		this.app=app;
		this.value=value; 
		
		this.r = r;
		this.g = g;
		this.b = b;
		
		isMov = true;

	}
	
	protected abstract void drawFigure();
	//abstract because each figure is drawn with different methods
	
	protected void move() {
		if (isMov) {
			if(posY - (tam/2) >= 0 && posY + (tam/2) <= 599) {
				posY += (direction);
				
				if (posY - (tam/2) == 0 || posY + (tam/2) == 599) {			
					direction = direction *(-1);
				}
			}
			else if(posY - (tam/2) < 0) {
				if(direction == 1) {
					posY += (direction);
				}
				else if(direction == -1) {
					direction = direction *(-1);
					posY += (direction);
				}
			}
			else if(posY + (tam/2) > 599) {
				if(direction == 1) {
					direction = direction *(-1);
					posY += (direction);
				}
				else if(direction == -1) {
					posY += (direction);
				}
			}
		}
	}
	
	public boolean isMov() {
		return isMov;
	}
	public void setMov(boolean isMov) {
		this.isMov = isMov;
	}
	
	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public int getTam() {
		return tam;
	}
	
	public int getValue() {
		return value;
	}

}