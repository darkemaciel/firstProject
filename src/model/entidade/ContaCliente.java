package model.entidade;

public class ContaCliente {
	
	private int conta;
	private String cliente;
	private double saldo;
	
	public ContaCliente(int conta, String cliente, double valorInicial) {
		this.conta = conta;
		this.cliente = cliente;
		Deposito(valorInicial);
	}
	
	public ContaCliente(int conta, String cliente) {
		this.conta = conta;
		this.cliente = cliente;
	}

	public int getConta() {
		return conta;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void Deposito(double valor) {
		saldo += valor;
	}

	public void Saque(double valor) {
		saldo -= valor + 5;
	}

	public String toString() {
		return	String.format("Conta: %d", getConta())
				+ ", "
				+ "Cliente: " 
				+ getCliente()
				+ ", "
				+ String.format("Valor: $%.2f", getSaldo());
		}
	
	
}
