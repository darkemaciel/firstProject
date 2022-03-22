package secao19;

import java.util.Arrays;
import java.util.List;

public class Aula225 {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
	}

	// o tipo <?> é o super tipo de lista.
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
