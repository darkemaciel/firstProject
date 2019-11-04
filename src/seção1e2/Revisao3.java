package seção1e2;

import java.util.Scanner;

public class Revisao3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua senha: ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida!");
			System.out.println("Digite sua senha: ");
			senha = sc.nextInt();
		}
		System.out.println("Acesso permitido!");
		
		sc.close();
	}

}
