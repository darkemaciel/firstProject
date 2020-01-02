package secao6;

import java.util.Locale;
import java.util.Scanner;

import model.entidade.Acompanhamento;

public class ExercicioDeFixacao3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Acompanhamento aluno = new Acompanhamento();
		
		System.out.print("Informe o nome do Aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.printf("Informe a primeira nota do %s: ", aluno.nome);
		aluno.nota1 = sc.nextDouble();
		
		while (aluno.nota1 < 0 || aluno.nota1 > 30) {
			System.out.print("Nota inválida! Informe a nota novamente: ");
			aluno.nota1 = sc.nextDouble();
		}
		
		System.out.printf("Informe a segunda nota do %s: ", aluno.nome);
		aluno.nota2 = sc.nextDouble();
		while (aluno.nota2 < 0 || aluno.nota2 > 35) {
			System.out.print("Nota inválida! Informe a nota novamente: ");
			aluno.nota2 = sc.nextDouble();
		}	
		
		System.out.printf("Informe a terceira nota do %s: ", aluno.nome);
		aluno.nota3 = sc.nextDouble();
		while (aluno.nota3 < 0 || aluno.nota3 > 35) {
				System.out.print("Nota inválida! Informe a nota novamente: ");
				aluno.nota3 = sc.nextDouble();
			}
		
		System.out.println(aluno);
		
		sc.close();

	}

}
