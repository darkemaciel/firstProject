package seção1e2;

import java.util.Scanner;

public class WhileExerc4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor positivo: ");
		int n = sc.nextInt();
		
		while (n <= 0) {
			System.out.println("Digite um valor positivo: ");
			n = sc.nextInt();
		}
		
		int higher = Integer.MIN_VALUE;
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Valor #" + i + ": ");
			int x = sc.nextInt();
			if (x > higher) {
				higher = x;
			}
		}
		System.out.println("Maior valor é: " + higher);
		sc.close();
	}

}
