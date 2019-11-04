package seção1e2;

import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		
		char gender = 'F';
		int age = 32;
		double balance = 10.35474;
		String name = "Maria";
		
		System.out.println("Bom dia!"); // ln = pula uma linha.
		System.out.println("Boa tarde!");
		System.out.println("Boa noite");
		System.out.println("------------------------------");
		System.out.printf("%.2f%n", balance);
		System.out.printf("%.4f%n", balance);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", balance);
		System.out.println("------------------------------");
		System.out.printf("%s tem %d anos, de sexo %c e tem %.2f bitcoins.%n", name, age, gender, balance);

	}

}
