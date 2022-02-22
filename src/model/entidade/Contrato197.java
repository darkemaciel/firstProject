package model.entidade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato197 {

	private Integer numero;
	private Date data;
	private Double totalValor;
	
	List<Parcelas197> parcelas = new ArrayList<Parcelas197>();
	
	public Contrato197() {
	}

	public Contrato197(Integer numero, Date data, Double totalValor) {
		super();
		this.numero = numero;
		this.data = data;
		this.totalValor = totalValor;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getTotalValor() {
		return totalValor;
	}

	public void setTotalValor(Double totalValor) {
		this.totalValor = totalValor;
	}

	public List<Parcelas197> getParcelas() {
		return parcelas;
	}
	
}
