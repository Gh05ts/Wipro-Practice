package abstractExcetion.abstracte.q1;

public class ICICIBank extends GeneralBank {
	
	@Override
	public double getSavingInterestRate() {
		return 4.0;
	}

	@Override
	public double getFixedInterestRate() {
		return 8.5;
	}

}
