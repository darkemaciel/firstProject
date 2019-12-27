package secao15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula135 {

	public static void main(String[] args) {

		metodo1();
		
		System.out.println("Fim do programa.");

	}

	public static void metodo1() {
		System.out.println("***In�cio do M�todo 1***");
		metodo2();
		System.out.println("***Final do M�todo 1***");

	}

	public static void metodo2() {
		System.out.println("***In�cio do M�todo 2***");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int posicao = sc.nextInt();
			System.out.println(vect[posicao]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posi��o inv�lida!");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Valor inv�lido!");
		}
		sc.close();
		System.out.println("***Final do M�todo 2***");
	}
}
