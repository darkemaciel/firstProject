package entidade;

public class Acompanhamento {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double somaNota() {
		return nota1 + nota2 + nota3;
	}
	
	public String toString() {
		if (somaNota() > 60) {
			return "Aprovado!";
		}
		else {
			return "Reprovado!"
					+ " Faltam "
					+ String.format("%.2f pontos", ((somaNota()-60)* (-1)));
		}
	}
}
