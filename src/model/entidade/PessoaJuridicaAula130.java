package model.entidade;

public class PessoaJuridicaAula130 extends PessoaAula130 {

	private Integer numeroFuncionario;

	public PessoaJuridicaAula130() {
		super();
	}

	public PessoaJuridicaAula130(String nome, Double rendaAnual, Integer numeroFuncionario) {
		super(nome, rendaAnual);
		this.numeroFuncionario = numeroFuncionario;
	}

	public int getNumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setNumeroFuncionario(Integer numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}

	@Override
	public Double valorImposto() {
		if (numeroFuncionario > 10) {
			return getRendaAnual() * 0.14;
		} else {
			return getRendaAnual() * 0.16;
		}
	}
	
}
