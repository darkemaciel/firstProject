package model.entidade;

public class ProdutoAula127 {

	private String nome;
	private double preco;

	public ProdutoAula127() {
		super();
	}

	public ProdutoAula127(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public String precoTag() {
		return "Produto: " 
				+ nome
				+ "\n"
				+ "Preço: $"
				+ String.format("%.2f", preco);
	}
	
}
