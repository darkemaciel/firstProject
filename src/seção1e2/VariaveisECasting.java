package seção1e2;

public class VariaveisECasting {

	public static void main(String[] args) {
		double a;
		float b;
		double c;
		int d;
		int e, f;
		double result;
		
		a = 5.7;
		b = (float) a; // Devido a perda da memoria é obrigatório a utilização do cast.
		c = 5.5;
		d = (int) c;  // Devido a perda da memoria é obrigatório a utilização do cast. 
		e = 5;
		f = 2;
		result = (double) e / f;  // double é de um tipo mais complexo e compatível.
							      // Apesar de funcionar o valor será truncado (perda de info).
		
		System.out.println(result);
		System.out.println(b);
		System.out.println(d);
	}
}