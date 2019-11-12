package introducao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeFixacao2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomeCompleto = sc.nextLine();
		int quartos = sc.nextInt();
		double preco = sc.nextDouble();
		String lastname = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();		
		
		System.out.println(nomeCompleto);
		System.out.println(quartos);
		System.out.println(preco);
		System.out.println(lastname);
		System.out.println(age);
		System.out.println(height);
		
		sc.close();
	}

}
