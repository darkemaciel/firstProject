package secao17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aula178 {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

		String path = "c:\\Users\\Darke\\Documents\\out.txt";

	// adcionando o par�metro "true" no FileWriter adiciona no arquivo criado as novas informa��es ao inv�s de recria-lo.
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
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
