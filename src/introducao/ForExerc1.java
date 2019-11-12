package introducao;

import java.util.Scanner;

public class ForExerc1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int x = sc.nextInt();

		if (x >= 1 && x <= 1000) {

			for (int i = 1; i <= x; i++) {

				if (i % 2 != 0) {
					System.out.println(i);

				}
			}
			sc.close();
		}
	}
}