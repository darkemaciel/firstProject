package seção1e2;

import java.util.Scanner;

public class ForExerc5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o valor fatorial: ");
		int n = sc.nextInt();
		
		int fat = 1;
		for (int i = 1; i <= n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		sc.close();
	}

}
