package secao6;

import java.util.Locale;
import java.util.Scanner;

import entidade.Calcular;

public class Aula51 {


	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = Calcular.circuferencia(raio);
		double v = Calcular.volume(raio);
		
		System.out.printf("Circuferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f", Calcular.PI);
		
		sc.close();
		
	}
}
