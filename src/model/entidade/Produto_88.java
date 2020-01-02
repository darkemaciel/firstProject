package model.entidade;

public class Produto_88 {
	
	private String produto;
	private double preco;
	
	public Produto_88() {
	}

	public Produto_88(String produto, double preco) {
		this.produto = produto;
		this.preco = preco;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto = "
				+ produto
				+ ", Preço = "
				+ preco;
	}
	
}
