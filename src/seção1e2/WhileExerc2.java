package seção1e2;

import java.util.Scanner;

public class WhileExerc2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante");
			}
			else if (x > 0 && y < 0) {
				System.out.println("Quarto quadrante");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro quadrante");
			}
			else {
				System.out.println("Segundo quadrante");
			}
			System.out.println("Digite dois números: ");
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		
		sc.close();
	}

}
