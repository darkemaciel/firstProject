package secao17;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Aula175 {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\darke.rangel\\Documents\\test.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
