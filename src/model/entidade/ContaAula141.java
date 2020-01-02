package model.entidade;

import model.exceptions.DomainException;

public class ContaAula141 {

	private Integer numeroConta;
	private String cliente;
	private Double saldo;
	private Double limiteSaque;

	public ContaAula141() {
	}

	public ContaAula141(Integer numeroConta, String cliente, Double saldo, Double limiteSaque) {
		super();
		this.numeroConta = numeroConta;
		this.cliente = cliente;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}


	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}


	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	

	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque (double valor) {
		if (valor > saldo) {
			throw new DomainException("Erro: saldo insuficiente.");
		}
		if (valor > limiteSaque) {
			throw new DomainException("Erro: limite de saque indisponível.");
		}
		saldo -= valor;
	}

	@Override
	public String toString() {
		return "ContaAula141 [numeroConta=" + numeroConta + ", cliente=" + cliente + ", saldoInicial=" + saldo
				+ ", limiteSaque=" + limiteSaque + "]";
	}
}
