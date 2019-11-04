package secao5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Empregado;

public class Aula76 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos empregados serão registrados?");
		int n = sc.nextInt();
		
		List<Empregado> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Empregado #:" + i);
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Salário: ");
			double salario = sc.nextDouble();
			list.add(new Empregado(id, nome, salario));
		}
		
		System.out.println();
		System.out.println("Digite o ID do empregado que terá aumento.");
		int id = sc.nextInt();
		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("ID não existe.");
		}
		else {
			System.out.print("Digite a porcentagem do aumento: ");
			double porcentagem = sc.nextDouble();
			emp.AumentoSalario(porcentagem);
		}
		
		System.out.println();
		System.out.println("Lista de empregados:");
		for (Empregado obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
		
	}

}
