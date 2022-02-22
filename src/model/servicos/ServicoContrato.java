package model.servicos;

import java.util.Calendar;
import java.util.Date;

import model.entidade.Contrato197;
import model.entidade.Parcelas197;

public class ServicoContrato {

	private ServicoPagamentoOnline servicoPagamentoOnline;

	public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}

	public void processamentoContrato(Contrato197 contrato, int meses) {
		double parcelaBasica = contrato.getTotalValor() / meses;
		for (int i = 1; i <= meses; i++) {
			double parcelaAtualizada = parcelaBasica + servicoPagamentoOnline.juros(parcelaBasica, i);
			double totalParcela = parcelaAtualizada + servicoPagamentoOnline.taxaPagamento(parcelaAtualizada);
			Date dataVencimento = addMeses(contrato.getData(), i);
			contrato.getParcelas().add(new Parcelas197(dataVencimento, totalParcela));
		}
	}

	private Date addMeses(Date data, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.MONTH, N);
		return calendar.getTime();
	}
}
