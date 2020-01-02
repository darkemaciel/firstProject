package model.entidade;

public class ProdutoImportadoAula127 extends ProdutoAula127 {

	private int taxaDeImportacao;

	public ProdutoImportadoAula127() {
		super();
	}

	public ProdutoImportadoAula127(String nome, Double preco, int taxaDeImportacao) {
		super(nome, preco);
		this.taxaDeImportacao = taxaDeImportacao;
	}

	public int getTaxaDeImportacao() {
		return taxaDeImportacao;
	}

	public void setTaxaDeImportacao(int taxaDeImportacao) {
		this.taxaDeImportacao = taxaDeImportacao;
	}

	@Override
	public String precoTag() {
		return  "Produto: "
				+ getNome() + "\n"
				+ "Preço: $ "
				+ String.format("%.2f", getPreco()) + "\n"
				+ "Taxa: $"
				+ taxaDeImportacao;
	}

}
