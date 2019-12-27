package secao14;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.CirculoAula129;
import entidade.RetanguloAula129;
import entidade.ShapeAula129;
import entidade.enums.Cor;

public class Aula129 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<ShapeAula129> list = new ArrayList<>();

		System.out.print("Digite o número de formas: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Formato #" + i + ":");
			System.out.print("Retangulo ou Círculo (r/c): ");
			char a = sc.next().charAt(0);
			System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
			Cor cor = Cor.valueOf(sc.next());
			if (a == 'r') {
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				System.out.println("Base: ");
				double base = sc.nextDouble();
				list.add(new RetanguloAula129(cor, base, altura));
			} else {
				System.out.println("Raio: ");
				double raio = sc.nextDouble();
				list.add(new CirculoAula129(cor, raio));
			}
		}

		System.out.println();
		System.out.println("Areas: ");
		for (ShapeAula129 formas : list) {
			System.out.println(formas.area());
		}
		sc.close();
	}

}
