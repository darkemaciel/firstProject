package entidade;

public class Colaborador {
	public String nome;
	public double salarioBruto;
	public double imposto;
	public double aumento;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}

	public double aumentoSalario() {
		return salarioLiquido() + ((salarioBruto * aumento) / 100);
	}
	
	public String toString() {
		return nome
				+ ", "
				+ String.format("%.2f", salarioLiquido());
	}
}
