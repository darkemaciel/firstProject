package se��o1e2;

import java.util.Scanner;

public class OperadoresComparativos2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que horas s�o?");
		double horas = sc.nextDouble();
		
		if (horas < 12)
		System.out.println("Bom dia!");
		else if (horas <= 12 || horas < 18)
		System.out.println("Boa tarde!");
		else
		System.out.println("Boa noite");
		
		sc.close();
	}

}
