package model.servicos;

public class ServicoPaypal implements ServicoPagamentoOnline {

	private static final double TAXA_PAGAMENTO = 0.02;
	private static final double TAXA_JUROS = 0.01;

	@Override
	public double taxaPagamento(double valor) {
		return valor * TAXA_PAGAMENTO;
	}

	@Override
	public double juros(double valor, int meses) {
		return valor * meses * TAXA_JUROS;
	}

	
}
