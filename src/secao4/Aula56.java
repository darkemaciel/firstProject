package secao4;

import java.util.Locale;
import java.util.Scanner;
import entidade.Produto;

public class Aula56 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Enter product data. ");
		System.out.print("Name: ");
		String nome = sc.nextLine();
		
		System.out.print("Price: ");
		double preco = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantidade = sc.nextInt();
		System.out.println();
		
		Produto produto = new Produto(nome, preco, quantidade);
		
		System.out.println("Product data: " + produto);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		quantidade = sc.nextInt();
		
		produto.addProdutos(quantidade);
		
		System.out.println();
		System.out.println("Updated data: " + produto);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println();
		System.out.println("Updated data: " + produto);
		
		sc.close();
	}
}