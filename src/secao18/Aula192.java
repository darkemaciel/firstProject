package secao18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entidade.AluguelCarro193;
import model.entidade.Veiculo193;
import model.servicos.ServicoAluguel;
import model.servicos.TaxaServicoBrasil;

public class Aula192 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

		System.out.println("Entre com os dados da locação.");
		System.out.print("Modelo do carro: ");
		String veiculo = sc.nextLine();
		System.out.print("Data inicial (dd/MM/yyyy hh:ss): ");
		Date dataInicio = sdf.parse(sc.nextLine());
		System.out.print("Data final (dd/MM/yyyy hh:ss): ");	
		Date dataFim = sdf.parse(sc.nextLine());
		
		AluguelCarro193 cr = new AluguelCarro193(dataInicio, dataFim, new Veiculo193(veiculo));
		
		System.out.print("Preço por hora: ");
		double precoHora = sc.nextDouble();
		System.out.print("Preço por dia: ");
		double precoDia = sc.nextDouble(); 

		ServicoAluguel servicoAluguel = new ServicoAluguel(precoDia, precoHora, new TaxaServicoBrasil());
		
		servicoAluguel.processInvoice(cr);
		
		System.out.println("Fatura: ");
		System.out.println("Pagamento basico: " + String.format("%.2f", cr.getInvoice().getPagamentoBasico()));
		System.out.println("Taxa: " + String.format("%.2f", cr.getInvoice().getTaxa()));
		System.out.println("Total pagamento: " + String.format("%.2f", cr.getInvoice().getPagamentoTotal()));

		sc.close();
		
	}

}
