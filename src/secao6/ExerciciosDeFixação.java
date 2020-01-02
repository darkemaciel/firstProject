package secao6;

import java.util.Scanner;

import model.entidade.Retangulo;

public class ExerciciosDeFixa��o {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Insira o valor da base do ret�ngulo:");
		retangulo.a = sc.nextDouble();
		System.out.println("Insira o valor da altura do ret�ngulo:");
		retangulo.b = sc.nextDouble();
		
		System.out.println("O valor da �rea: " + retangulo.area());
		System.out.println("O valor da perimetro: " + retangulo.perimetro());
		System.out.printf("O valor da diagonal: %.2f%n", retangulo.diagonal());
		
		sc.close();
	}
}