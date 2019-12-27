package secao15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidade.ReservaAula138;

public class Aula138 {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Reserva: ");
		System.out.print("Número do Quarto: ");
		int quarto = sc.nextInt();
		System.out.print("Data de check-in (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Data de check-out (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("Erro na reserva: Data de Check-Out precisa ser posterior a data de Check-In.");
		} 
		else {
			ReservaAula138 reserva = new ReservaAula138(quarto, checkIn, checkOut);
			System.out.println(reserva);

			System.out.println();
			System.out.println("Entre com as datas para atualizar a reserva:");
			System.out.print("Data de check-in (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data de check-out (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());

			Date agora = new Date();
				if (checkIn.before(agora) || checkOut.before(agora)) {
				System.out.println("Erro na reserva: Data de atualização é inválida.");
			} 
				else if (!checkOut.after(checkIn)) {
					System.out.println("Erro na reserva: Data de Check-Out precisa ser posterior a data de Check-In.");

			} 
				else {
					reserva.updateDates(checkIn, checkOut);
					System.out.println("Atualização de " + reserva);
			}
		}

		sc.close();
	}

}
