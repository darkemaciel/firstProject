package secao8;

import java.util.Locale;
import java.util.Scanner;

import model.entidade.Produto_Aula70;

public class Aula70 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Produto_Aula70[] vect = new Produto_Aula70[n];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Produto_Aula70(nome, preco); 
		}
		
		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma += vect[i].getPreco();
		}
		
		double media = soma / n;
		
		System.out.printf("A média é: %.2f%n", media);
			
		sc.close();

	}

}
