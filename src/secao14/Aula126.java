package secao14;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entidade.FuncionarioAula126;
import model.entidade.FuncionarioTerceirizadoAula126;

public class Aula126 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<FuncionarioAula126> list = new ArrayList<>();

		System.out.print("Número de funcionários: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do empregado #" + i);
			System.out.println("É terceirizado? (y/n)");
			char x = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (x == 'y') {
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				FuncionarioAula126 emp = new FuncionarioTerceirizadoAula126(name, hours, valuePerHour,
						additionalCharge);
				list.add(emp);
			} else {
				FuncionarioAula126 emp = new FuncionarioAula126(name, hours, valuePerHour);
				list.add(emp);
			}
			
		}

		System.out.println();
		System.out.println("Payments: ");
		for (FuncionarioAula126 emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}

}
