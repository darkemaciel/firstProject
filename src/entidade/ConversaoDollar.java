package entidade;

public class ConversaoDollar {
	
	public static double Conversao(double valorDollar, double quantidadeDollar) {
		return quantidadeDollar * valorDollar + (quantidadeDollar * valorDollar *0.06);
	}
}
