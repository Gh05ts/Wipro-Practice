package abstractExcetion.abstracte.q1;

public class KotakBank extends GeneralBank{
	
	@Override
	public double getSavingInterestRate() {
		return 6.0;
	}

	@Override
	public double getFixedInterestRate() {
		return 9.0;
	}

}
