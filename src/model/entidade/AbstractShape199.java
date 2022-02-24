package model.entidade;

import model.enums.Color;

public abstract class AbstractShape199 implements Shape199 {
	
	private Color color;

	public AbstractShape199(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
