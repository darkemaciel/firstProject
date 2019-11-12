package introducao;

import java.util.Scanner;

public class OperadoresComparativos1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro: ");
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("Par!");
		}
		else {
			System.out.println("Ímpar!");
		}
		
		sc.close();
	}

}
