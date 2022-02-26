package model.servicos;

import java.security.InvalidParameterException;

public class UsaInterestService202 implements InterestService202 {

	private double interestRate;

	public UsaInterestService202(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
