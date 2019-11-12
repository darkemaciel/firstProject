package introducao;

import java.util.Scanner;

public class Revisao2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// exercicio 1
		
		System.out.println("Digite um número inteiro:");
		int a = sc.nextInt();
		
		if (a < 0 )
		System.out.println("Número negativo!");
		else
		System.out.println("Número não negativo!");
		
		// exercicio 2
		
		System.out.println("Digite outro numero:");
		int n = sc.nextInt();
		
		if (n % 2 != 0)
		System.out.println("Ímpar!");
		else
		System.out.println("Par!");
		
		sc.close();
	}

}
