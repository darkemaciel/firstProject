package secao14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entidade.ProdutoAula127;
import model.entidade.ProdutoImportadoAula127;
import model.entidade.ProdutoUsadoAula127;

public class Aula127 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<ProdutoAula127> list = new ArrayList<>();

		System.out.print("Digite no número de produtos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Produto #" + i + ":");
			System.out.print("Classifique como: c (comum), u (usado) ou i (importado): ");
			char a = sc.next().charAt(0);
			System.out.print("Nome do produto: ");
			String nome = sc.next();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();

			// Criando um produto e adicionando a lista
			if (a == 'c') {
				list.add(new ProdutoAula127(nome, preco));

			} 
			// Criando um produto usado e adicionando a lista
			else if (a == 'u') { 
				System.out.print("Data de fabricação (dd/mm/yyyy): ");
				Date dataProducao = sdf.parse(sc.next());
				list.add(new ProdutoUsadoAula127(nome, preco, dataProducao));

			} 
			// Criando um produto importado e adicionando a lista
			else { 
				System.out.print("Taxa (%): ");
				int taxa = sc.nextInt();
				list.add(new ProdutoImportadoAula127(nome, preco, taxa));
			}
		}

		System.out.println();
		System.out.println("Tags: ");
		for (ProdutoAula127 prod : list) {
			System.out.println(prod.precoTag());
		}

		sc.close();

	}

}
