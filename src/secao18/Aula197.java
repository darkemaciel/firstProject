package secao18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entidade.Contrato197;
import model.entidade.Parcelas197;
import model.servicos.ServicoContrato;
import model.servicos.ServicoPaypal;

public class Aula197 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com o número do contrato.");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		Date data = sdf.parse(sc.next());
		System.out.print("Valor do contrato: ");
		double totalValor = sc.nextDouble();		
		System.out.print("Numero de meses: ");
		int meses = sc.nextInt();
		
		Contrato197 contrato = new Contrato197(numero, data, totalValor);
		
		ServicoContrato cs = new ServicoContrato(new ServicoPaypal());
		
		
		cs.processamentoContrato(contrato, meses);
		
		System.out.println("Parcelas: ");
		for (Parcelas197 x : contrato.getParcelas()) {
			System.out.println(x);
		}
		
		sc.close();
	}

}
