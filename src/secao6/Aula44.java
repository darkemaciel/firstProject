package secao6;

import java.util.Locale;
import java.util.Scanner;

public class Aula44 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		Locale.setDefault(Locale.US);
		System.out.println("Digite os valores do tri�ngulo A.");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Digite os valores do tri�ngulo B.");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC)/2;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p * xC));
		
		p = (yA + yB + yC)/2;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p * yC));
		
		System.out.printf("Area de triangulo A � de: %.4f%n", areaX);
		System.out.printf("Area de triangulo B � de: %.4f%n", areaY);
		
		if (areaX > areaY)
		System.out.println("O triangulo A � maior.");
		else 
		System.out.println("O triangulo B � maior");
		
		sc.close();
	}

}
