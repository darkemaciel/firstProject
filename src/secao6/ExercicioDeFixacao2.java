package secao6;

import java.util.Locale;
import java.util.Scanner;

import model.entidade.Colaborador;

public class ExercicioDeFixacao2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Colaborador colaborador = new Colaborador();
		
		System.out.println("Informe o nome do colarador:");
		colaborador.nome = sc.nextLine();
		System.out.println("Informe o salário do colaborador:");
		colaborador.salarioBruto = sc.nextDouble();
		System.out.println("Informe o valor($) do imposto:");
		colaborador.imposto = sc.nextDouble();
		
		System.out.println("Colaborador: " + colaborador);
		System.out.println();
		System.out.println("Qual o percentual de aumento no salário?");
		colaborador.aumento = sc.nextDouble();
		
		System.out.println("Atualização: " + colaborador.nome + ", " + colaborador.aumentoSalario());
		
		sc.close();
	}

}
