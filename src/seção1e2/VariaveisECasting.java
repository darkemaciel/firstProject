package se��o1e2;

public class VariaveisECasting {

	public static void main(String[] args) {
		double a;
		float b;
		double c;
		int d;
		int e, f;
		double result;
		
		a = 5.7;
		b = (float) a; // Devido a perda da memoria � obrigat�rio a utiliza��o do cast.
		c = 5.5;
		d = (int) c;  // Devido a perda da memoria � obrigat�rio a utiliza��o do cast. 
		e = 5;
		f = 2;
		result = (double) e / f;  // double � de um tipo mais complexo e compat�vel.
							      // Apesar de funcionar o valor ser� truncado (perda de info).
		
		System.out.println(result);
		System.out.println(b);
		System.out.println(d);
	}
}