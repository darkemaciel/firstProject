package model.entidade;

import java.util.Date;

public class AluguelCarro193 {

	private Date start;
	private Date fim;
	
	private Veiculo193 veiculo;
	private Invoice193 invoice;
	
	public AluguelCarro193() {

	}

	public AluguelCarro193(Date start, Date fim, Veiculo193 veiculo) {
		this.start = start;
		this.fim = fim;
		this.veiculo = veiculo;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public Veiculo193 getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo193 veiculo) {
		this.veiculo = veiculo;
	}

	public Invoice193 getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice193 invoice) {
		this.invoice = invoice;
	}
	
}
