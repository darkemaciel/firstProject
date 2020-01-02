package model.entidade;

public class Funcionario {
	private Double salario;
	private String nome;
	private Integer id;


	public Funcionario(Double salario, String nome, Integer id) {
		this.salario = salario;
		this.nome = nome;
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void AumentoSalario(double aumento) {
		 salario += salario * aumento / 100;
	}
	
	
	@Override
	public String toString() {
		return  "ID: "
				+ id + "\n"
				+ "Nome: " 
				+ nome + "\n"
				+ "Salario: R$"
				+ String.format("%.2f", salario) + "\n";
	}

	
	
}
