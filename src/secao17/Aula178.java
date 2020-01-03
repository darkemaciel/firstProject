package secao17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aula178 {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

		String path = "C:\\Users\\darke.rangel\\Documents\\out.txt";

	// adcionando o parâmetro "true", somente adiciona no arquivo criado as novas informações, ao invés de recria-lo.
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}
}
