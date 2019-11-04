package se��o_3;

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
		
		System.out.println("Digite os valores do tri�ngulo X.");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite os valores do tri�ngulo Y.");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Area de triangulo A � de: %.4f%n", areaX);
		System.out.printf("Area de triangulo B � de: %.4f%n", areaY);
		
		if (areaX > areaY)
		System.out.println("O triangulo A � maior.");
		else 
		System.out.println("O triangulo B � maior");
		
		sc.close();
	}
}
