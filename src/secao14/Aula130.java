package secao14;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.PessoaAula130;
import entidade.PessoaFisicaAula130;
import entidade.PessoaJuridicaAula130;

public class Aula130 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<PessoaAula130> list = new ArrayList<>();

		System.out.println("Quantos funcionários ou empresas?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Digite os dados para o cálculo do imposto.");
			System.out.print("Pessoa Física (f) ou Jurídica (j): ");
			char a = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();

			if (a == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastoSaude = sc.nextDouble();
				PessoaAula130 pessoa = new PessoaFisicaAula130(nome, rendaAnual, gastoSaude);
				list.add(pessoa);
			} else {
				System.out.print("Número de funcionários: ");
				int numeroFuncionario = sc.nextInt();
				PessoaAula130 pessoa = new PessoaJuridicaAula130(nome, rendaAnual, numeroFuncionario);
				list.add(pessoa);
			}
			System.out.println();
		}
		
		double sum = 0.0;
		System.out.println();
		System.out.println("Impostos pagos:");
		for (PessoaAula130 pess : list) {
			System.out.println(pess);
			double taxa = pess.valorImposto();
			sum += taxa;
		}
		
		System.out.printf("Total arrecadado: $%.2f", sum);
		
		sc.close();
	}

}
