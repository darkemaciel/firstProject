package model.entidade;

public class Empregado {
	
	private Integer id;
	private String nome;
	private Double salario;
	
	public Empregado(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void AumentoSalario(double porcentagem) {
		salario += salario * porcentagem / 100;
	}

	@Override
	public String toString() {
		return "ID: "
				+ id
				+ ", "
				+ "Nome: "
				+ nome
				+ ", "
				+ String.format("Salário: %.2f%n", getSalario());
	}
}
