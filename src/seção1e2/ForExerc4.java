package seção1e2;

import java.util.Locale;
import java.util.Scanner;

public class ForExerc4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Digite o numero de testes: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
		
			System.out.println("Digite os valores");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			
			if (y != 0) {
				double divisao = x/y;
				System.out.printf("%.2f%n", divisao);
			}
			else {
				System.out.println("Divisão Impossível!");
			}
		}
		
		sc.close();

	}

}