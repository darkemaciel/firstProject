package entidade;

import entidade.enums.Cor;

public abstract class ShapeAula129 {

	private Cor cor;
	
	public ShapeAula129() {
		super();
	}
	
	public ShapeAula129(Cor cor) {
		super();
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	public abstract double area();
}
