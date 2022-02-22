package model.servicos;

import model.entidade.AluguelCarro193;
import model.entidade.Invoice193;

public class ServicoAluguel {

	private Double precoDia;
	private Double precoHora;

	private TaxaServico taxaServico;

	public ServicoAluguel(Double precoDia, Double precoHora, TaxaServico taxaServico) {
		super();
		this.precoDia = precoDia;
		this.precoHora = precoHora;
		this.taxaServico = taxaServico;
	}

	public void processInvoice(AluguelCarro193 aluguelCarro193) {
		long t1 = aluguelCarro193.getStart().getTime();
		long t2 = aluguelCarro193.getFim().getTime();
		
		double hours = (double) (t2 - t1) / 1000 / 60 / 60;
		
		double pagamentoBasico;
		if (hours <= 12) {
			pagamentoBasico = Math.ceil(hours) * precoHora;
		} else {
			pagamentoBasico = Math.ceil(hours / 24) * precoDia;
		}
		
		double taxa = taxaServico.taxa(pagamentoBasico);
		
		aluguelCarro193.setInvoice(new Invoice193(pagamentoBasico, taxa));
	}
}
