package entidade;

import entidade.enums.Cor;

public class RetanguloAula129 extends ShapeAula129 {

	private Double base;
	private Double altura;

	public RetanguloAula129() {
		super();
	}

	public RetanguloAula129(Cor cor, Double base, Double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return base * altura;
	}

}
