package model.servicos;

public interface ServicoPagamentoOnline {

	double taxaPagamento (double valor);
	double juros (double valor, int meses);
}
