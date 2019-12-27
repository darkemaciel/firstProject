package entidade;

public class FuncionarioTerceirizadoAula126 extends FuncionarioAula126 {

	private Double additionalCharge;

	public FuncionarioTerceirizadoAula126() {
		super();
	}

	public FuncionarioTerceirizadoAula126(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
