package introducao;

import java.util.Locale;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite um número: ");
		double n = sc.nextDouble();
		
		while (n >= 0.0) {
			double sr = Math.sqrt(n);
			System.out.printf("%.3f%n", sr);
			System.out.print("Digite outro número: ");
			n = sc.nextDouble();
		}
		System.out.println("Número negativo!");
		
		sc.close();
	}

}
