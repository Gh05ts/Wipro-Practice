package abstractExcetion.abstracte.q1;

public class q1 {

	public static void main(String[] args) {
		ICICIBank i = new ICICIBank();
		KotakBank k = new KotakBank();

		System.out.println(i.getSavingInterestRate());
		System.out.println(i.getFixedInterestRate());
		System.out.println(k.getSavingInterestRate());
		System.out.println(k.getFixedInterestRate());
		
		GeneralBank gb1 = new ICICIBank();
		GeneralBank gb2 = new KotakBank();
		
		System.out.println(gb1.getSavingInterestRate());
		System.out.println(gb1.getFixedInterestRate());
		System.out.println(gb2.getSavingInterestRate());
		System.out.println(gb2.getFixedInterestRate());
	}

}
