package seção_3;

import java.util.Locale;
import java.util.Scanner;

import entidade.Triangulo;

public class Aula45 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite os valores do triângulo X.");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite os valores do triângulo Y.");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Area de triangulo A é de: %.4f%n", areaX);
		System.out.printf("Area de triangulo B é de: %.4f%n", areaY);
		
		if (areaX > areaY)
		System.out.println("O triangulo A é maior.");
		else 
		System.out.println("O triangulo B é maior");
		
		sc.close();
	}
}
