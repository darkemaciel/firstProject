package secao6;

import java.util.Locale;
import java.util.Scanner;

import entidade.ConversaoDollar;

public class Aula53 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a cota��o do dollar?");
		double valorDollar = sc.nextDouble();

		System.out.println("Quantos dollares voc� vai comprar?");
		double quantidadeDollar = sc.nextDouble();

		double reais = ConversaoDollar.Conversao(valorDollar, quantidadeDollar);

		System.out.printf("A quantidade de reais �: $%.2f", reais);

		sc.close();
	}

}
