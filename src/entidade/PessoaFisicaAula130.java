package entidade;

public class PessoaFisicaAula130 extends PessoaAula130 {

	private double gastoSaude;

	public PessoaFisicaAula130() {
		super();
	}

	public PessoaFisicaAula130(String nome, Double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double valorImposto() {
		if (getRendaAnual() > 20000) {
			return (getRendaAnual() * 0.25) - (gastoSaude * 0.5);
		} else {
			return (getRendaAnual() * 0.15) - (gastoSaude * 0.5);

		}
	}

}
