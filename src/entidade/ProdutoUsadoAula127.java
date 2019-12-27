package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsadoAula127 extends ProdutoAula127 {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataDeProducao;

	public ProdutoUsadoAula127() {
		super();
	}

	public ProdutoUsadoAula127(String nome, Double preco, Date dataDeProducao) {
		super(nome, preco);
		this.dataDeProducao = dataDeProducao;
	}

	@Override
	public String precoTag() {
		return  "Produto: "
				+ getNome() + "\n"
				+ "Preço: $"
				+ String.format("%.2f", getPreco()) + "\n"
				+ "Data de Producao: "
				+ sdf.format(dataDeProducao);
	}
	
}
