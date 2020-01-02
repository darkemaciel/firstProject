package secao6;

import java.util.Scanner;

import model.entidade.Retangulo;

public class ExerciciosDeFixação {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Insira o valor da base do retângulo:");
		retangulo.a = sc.nextDouble();
		System.out.println("Insira o valor da altura do retângulo:");
		retangulo.b = sc.nextDouble();
		
		System.out.println("O valor da área: " + retangulo.area());
		System.out.println("O valor da perimetro: " + retangulo.perimetro());
		System.out.printf("O valor da diagonal: %.2f%n", retangulo.diagonal());
		
		sc.close();
	}
}