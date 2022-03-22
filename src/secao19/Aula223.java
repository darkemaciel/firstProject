package secao19;

import java.util.Scanner;

import model.servicos.PrintService205;

public class Aula223 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PrintService205<Integer> ps = new PrintService205<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		// O generics não aceita tipos diferentes de variaveis, mas ele possibilita reuso de listas de diferentes tipos.
		// ps.addValue("Maria");
		
		for (int i=0 ; i < n ; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		sc.close();
	}

}
