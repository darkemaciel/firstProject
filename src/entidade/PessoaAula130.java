package entidade;

public abstract class PessoaAula130 {

	private String nome;
	private Double rendaAnual;

	public PessoaAula130() {
		super();
	}

	public PessoaAula130(String nome, Double rendaAnual) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public abstract Double valorImposto();


	@Override
	public String toString() {
		return "Nome: "
				+ nome 
				+ ", renda anual: $"
				+ rendaAnual
				+ ", valor de imposto: $"
				+ String.format("%.2f", valorImposto());
	}
}
