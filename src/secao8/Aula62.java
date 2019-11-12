package secao8;

import java.util.Scanner;
import entidade.ContaCliente;

public class Aula62 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valorInicial;
		double valor;
		ContaCliente cliente;
		
		System.out.print("Digite o numero da conta: ");
		int conta = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite seu nome completo: ");
		String nome = sc.nextLine();
		
		System.out.println("Deseja realizar o depósito inicial? (n ou s) ");
		char x = sc.next().charAt(0);
		
		if (x == 's') {
			System.out.print("Digite o valor do depósito inicial: ");
			valorInicial = sc.nextDouble();
			cliente = new ContaCliente(conta, nome, valorInicial);
		} 
		else {
			cliente = new ContaCliente(conta, nome);	
		}
		
		System.out.println(cliente);
		
		System.out.println("Deseja realizar um depósito? (n ou s) ");
		x = sc.next().charAt(0);
		
		if (x == 's') {
		System.out.print("Digite o valor do depósito: ");
		valor = sc.nextDouble();
		cliente.Deposito(valor);
		System.out.println(cliente);
		}
		
		System.out.println("Deseja realizar um saque? (n ou s)");
		x = sc.next().charAt(0);
		
		if (x == 's') {
			System.out.print("Digite o valor do saque: ");
			valor = sc.nextDouble();
			cliente.Saque(valor);
			System.out.println(cliente);
		}
		else {
			System.out.println(cliente);
		}
		sc.close();
	}

}
