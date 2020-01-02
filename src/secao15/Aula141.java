package secao15;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entidade.ContaAula141;
import model.exceptions.DomainException;

public class Aula141 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Informe os dados da conta.");
			System.out.print("Número da conta: ");
			int numeroConta = sc.nextInt();
			System.out.print("Cliente: ");
			sc.nextLine();
			String cliente = sc.nextLine();
			System.out.print("Depósito Inicial (R$): ");
			double saldo = sc.nextDouble();
			System.out.print("Limite de saque (R$): ");
			double limiteSaque = sc.nextDouble();

			ContaAula141 conta = new ContaAula141(numeroConta, cliente, saldo, limiteSaque);

			System.out.println();
			System.out.print("Informe o valor do saque (R$): ");
			double valor = sc.nextDouble();

			conta.saque(valor);
			System.out.println(conta);
		} 
		catch (DomainException e) {
			System.out.println(e.getMessage());
		} 
		catch (InputMismatchException e) {
			System.out.println("Erro: dados inválidos.");
		}

		sc.close();

	}
}
