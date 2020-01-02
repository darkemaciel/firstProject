package secao8;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entidade.Funcionario;

public class RevisaoLista {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.println("Quantos funcionários serão cadastrados?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.printf("Digite seu ID: ");
			int id = sc.nextInt();
			System.out.print("Digite seu nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Digite seu salário: ");
			double salario = sc.nextDouble();
			list.add(new Funcionario(salario, nome, id));

		}

		System.out.println();
		System.out.printf("Digite o ID do empregado para o aumento: ");
		int id = sc.nextInt();
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("ID não existe.");
		} else {
			System.out.printf("Digite a porcentagem de aumento: ");
			double aumento = sc.nextDouble();
			emp.AumentoSalario(aumento);
		}
		
		System.out.println();
		System.out.println("Lista de empregados:");
		for (Funcionario x : list) {
			System.out.println(x);
		}

		sc.close();
	}
}
