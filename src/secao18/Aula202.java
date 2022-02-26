package secao18;

import java.util.Locale;
import java.util.Scanner;

import model.servicos.BrazilInterestService202;
import model.servicos.InterestService202;
import model.servicos.UsaInterestService202;

public class Aula202 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService202 is = new BrazilInterestService202(2.0);
		double payment = is.payment(amount, months);
		System.out.print("Payment after " + months + " months: R$" + String.format("%.2f", payment));
		
		
		System.out.println();
		
		InterestService202 us = new UsaInterestService202(1.0);
		double paymentUs = us.payment(amount, months);
		System.out.print("Payment after " + months + " months: $" + String.format("%.2f", paymentUs));		
		
		sc.close();
	}

}
