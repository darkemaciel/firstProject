package introducao;

import java.util.Locale;
import java.util.Scanner;

public class ForExerc3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Digite o numero de testes: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
		
			System.out.println("Digite os valores dos testes");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();
			
			double media = (x * 2.0 + y * 3.0 + z * 5.0)/ 10.0;
			
			System.out.printf("%.2f%n", media);
		}
		
		sc.close();

	}

}
