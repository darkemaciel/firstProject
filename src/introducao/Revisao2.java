package introducao;

import java.util.Scanner;

public class Revisao2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// exercicio 1
		
		System.out.println("Digite um n�mero inteiro:");
		int a = sc.nextInt();
		
		if (a < 0 )
		System.out.println("N�mero negativo!");
		else
		System.out.println("N�mero n�o negativo!");
		
		// exercicio 2
		
		System.out.println("Digite outro numero:");
		int n = sc.nextInt();
		
		if (n % 2 != 0)
		System.out.println("�mpar!");
		else
		System.out.println("Par!");
		
		sc.close();
	}

}
