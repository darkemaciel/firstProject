package secao18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entidade.Employee201;

public class Aula201 {

	public static void main(String[] args) {

		List<Employee201> list = new ArrayList<>();
		String path = "C:\\Users\\Darke\\Documents\\names.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String employee = br.readLine();
			while (employee != null) {
				String[] fields = employee.split(",");
				list.add(new Employee201(fields[0], Double.parseDouble(fields[1])));
				employee = br.readLine();
			}
			
			Collections.sort(list);
			for (Employee201 x : list) {
				System.out.println(x.getName() + ", " + String.format("%.2f", x.getSalary()));
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
