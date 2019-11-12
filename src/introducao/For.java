package introducao;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números inteiros você vai digitar?");
		int n = sc.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println("Valor #" + i + ": ");
			int x = sc.nextInt();
			sum += x;
		}
		
		System.out.println("Soma é: " + sum);
		sc.close();
	}

}
