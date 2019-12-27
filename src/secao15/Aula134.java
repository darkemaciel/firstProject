package secao15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula134 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int posicao = sc.nextInt();
			System.out.println(vect[posicao]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posi��o inv�lida!");
		} catch (InputMismatchException e ) {
			System.out.println("Valor inv�lido!");
		}
		
		System.out.println("Fim do programa.");
		sc.close();
	}

}
