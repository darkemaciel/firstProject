package model.servicos;

import java.security.InvalidParameterException;

public interface InterestService202 {

	double getInterestRate ();
	
	default double payment (double amount, int months) {
		if (months < 1 ) {
			throw new InvalidParameterException("Months must be greatter than zero");
		}
		return amount * Math.pow(1 + getInterestRate() / 100, months);
	}
}
