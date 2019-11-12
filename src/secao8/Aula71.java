package secao8;

import java.util.Locale;
import java.util.Scanner;

import entidade.CadastroAluguel;

public class Aula71 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CadastroAluguel[] vect = new CadastroAluguel[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			sc.hasNextLine();
			vect[quarto] = new CadastroAluguel(nome, email); 
		}
		
		System.out.println();
		System.out.println("Quartos ocupados: ");
			for (int i = 0; i < 10; i++) {
				if (vect[i] != null) {
					System.out.println(i + ": " + vect[i]);
				}
			}
		
		sc.close();
	}

}
