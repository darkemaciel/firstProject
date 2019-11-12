package secao11;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Aula100 {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println(sdf.format(d));
		
		System.out.println("--------------------");
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Minutos: " + minutes + " min");

		int month = 1 + cal.get(Calendar.MONTH); // O mês começa a contar no 0.
		System.out.println("Mês: " + month);
		
	}

}
