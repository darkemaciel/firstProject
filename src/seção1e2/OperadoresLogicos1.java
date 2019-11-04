package seção1e2;

import java.util.Scanner;

public class OperadoresLogicos1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 números");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if (n1 > n2 && n1 > n3)
		System.out.printf("Maior número: %d", n1);
		else if (n2 > n3)
		System.out.printf("Maior número: %d", n2);
		else
		System.out.printf("Maior número: %d", n3);
		
		sc.close();
	}

}
