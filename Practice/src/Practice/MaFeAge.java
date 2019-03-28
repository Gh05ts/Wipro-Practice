package Practice;

public class MaFeAge {

	public static void main(String[] args) {
		
		String gender = args[0];
		int age = Integer.parseInt(args[1]);

			if((gender.equals("Male") || gender.equals("Female")) && (age>=1 || age <= 100))
			
			{
				if(gender.equals("Female") && age <= 58)
					System.out.print("Interest = 8.2%");
				else if(gender.equals("Male") && age <= 58)
					System.out.print("Interest is 8.4%");
				else if(gender.equals("Female") && age >58)
					System.out.print("Interest is 9.2%");
				else if(gender.equals("Male") && age >58)
					System.out.print("Interest is 10.5%");
			}
			
			else
				
				System.out.print("Invalid gender or age");
		
	}

}
