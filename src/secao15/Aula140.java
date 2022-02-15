package secao15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.entidade.ReservaAula140;
import model.exceptions.DomainException;

public class Aula140 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.println("Reserva: ");
			System.out.print("Número do Quarto: ");
			int quarto = sc.nextInt();
			System.out.print("Data de check-in (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Data de check-out (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			
			ReservaAula140 reserva = new ReservaAula140(quarto, checkIn, checkOut);
			System.out.println(reserva);
			
			System.out.println();
			System.out.println("Entre com as datas para atualizar a reserva:");
			System.out.print("Data de check-in (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data de check-out (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			reserva.updateDates(checkIn, checkOut);
			System.out.println("Atualização de " + reserva);
		}
		catch (ParseException e) {
			System.out.println("Formato de data inválida");
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Número do quarto inválido.");
		}
		catch (RuntimeException e) {
			System.out.println("Erro inesperado.");
		}
		
		sc.close();
	}
 }
