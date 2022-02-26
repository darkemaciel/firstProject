package model.servicos;

public class BrazilInterestService202 implements InterestService202{

	private double interestRate;

	public BrazilInterestService202(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
