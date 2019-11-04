package seção1e2;

import java.util.Scanner;

public class WhileExerc3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código: ");
		int n = sc.nextInt();
		int alcool_1 = 0;
		int gasolina_2 = 0;
		int diesel_3 = 0;
		
		while (n != 4)	 {
			
			if (n == 1) {
				alcool_1++;
			}
			
			if (n == 2) {
				gasolina_2++;
			}
			
			if (n == 3) {
				diesel_3++;	
			}		
			
			System.out.println("Digite novamente o código: ");
			n = sc.nextInt();
		}
				
		System.out.println("Quantidade de Alcool: " + alcool_1);
		System.out.println("Quantidade de Gasolina: " + gasolina_2);
		System.out.println("Quantidade de Diesel: " + diesel_3);
		System.out.println("Muito obrigado!");
		
		sc.close();
	}

}
