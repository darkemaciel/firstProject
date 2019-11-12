package introducao;

import java.util.Scanner;

public class EntradaDeDados1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String sentenca = sc.nextLine();
		String x, y, z;
		x = sc.next();
		y = sc.next();
		z = sc.next();
		
		System.out.println(sentenca);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		x = sc.next();
		y = sc.next();
		z = sc.next();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}
