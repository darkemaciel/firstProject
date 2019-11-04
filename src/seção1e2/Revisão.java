package seção1e2;

import java.util.Locale;
import java.util.Scanner;

public class Revisão {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// exercicio 1
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + b);
		
		// exercicio 2
		
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = pi * (raio * raio);
		
		System.out.printf("área: %.4f%n", area);
		
		// exercicio 3
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int diferenca = (A * B - C * D);
		
		System.out.println(diferenca);
		
		// exercicio 4
		
		int f1 = sc.nextInt();
		int horas_f1 = sc.nextInt();
		double horas_trabalho_f1 = sc.nextDouble();
		double salario_f1 = horas_f1 * horas_trabalho_f1; 
		
		int f2 = sc.nextInt();
		int horas_f2 = sc.nextInt();
		double horas_trabalho_f2 = sc.nextDouble();
		double salario_f2 = horas_f2 * horas_trabalho_f2; 

		int f3 = sc.nextInt();
		int horas_f3 = sc.nextInt();
		double horas_trabalho_f3 = sc.nextDouble();
		double salario_f3 = horas_f3 * horas_trabalho_f3; 

		System.out.printf("Salário do funcionário %d é de $ %.2f%n", f1, salario_f1);
		System.out.printf("Salário do funcionário %d é de $ %.2f%n", f2, salario_f2);
		System.out.printf("Salário do funcionário %d é de $ %.2f%n", f3, salario_f3);
		
		sc.close();
		
	}

}
