package model.entidade;

import model.enums.Cor;

public class CirculoAula129 extends ShapeAula129 {

	private Double raio;

	public CirculoAula129() {
		super();
	}

	public CirculoAula129(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio;
	}

}
