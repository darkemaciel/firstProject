package secao19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entidade.Product224;
import model.servicos.CalculationService224;

public class Aula224 {

	public static void main(String[] args) {

		List<Product224> list = new ArrayList<>();
		Locale.setDefault(Locale.US);
		
		String path = "C:\\Users\\Darke\\Documents\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product224(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
		Product224 x = CalculationService224.max(list);
		System.out.println("Max: ");
		System.out.println(x);
		
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}