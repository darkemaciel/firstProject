package se��o1e2;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char resp;
		do {
			System.out.println("Digite um n�mero: ");
			double x = sc.nextInt();
			double quadrado = Math.sqrt(x);
			System.out.printf("Raiz quadrada �: %.3f%n", quadrado);
			
			System.out.println("Deseja repetir?");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		sc.close();
		
	}

}
