package secao14;

import entidade.Account;
import entidade.BusinessAccount;
import entidade.SavingsAccount;

public class Aula121 {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount) acc2; // Necess�rio colocar o CASTING.
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount) acc3; A acc3 � um SavingsAccount.
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}
