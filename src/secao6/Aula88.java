package secao6;

import java.util.Scanner;

import entidade.Produto_88;

public class Aula88 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o número de produtos: ");
		int n = sc.nextInt();
		double preco;
		String nome;
		
		Produto_88[] vect = new Produto_88[n];
		
		for (int i = 0; i < n ; i++) {
			System.out.printf("Digite o nome do produto: ");
			nome = sc.next();
			System.out.printf("Digite o preço do produto: ");
			preco = sc.nextDouble();
			vect[i] = new Produto_88(nome, preco);
		}		
		
		double sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += vect[i].getPreco();
		}
		
		double media = sum/n;
		
		System.out.printf("Preço médio é: %.2f%n", media);
		
		sc.close();
	}

}
