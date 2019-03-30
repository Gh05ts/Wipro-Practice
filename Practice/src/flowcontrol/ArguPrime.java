package flowcontrol;

public class ArguPrime {
	public static void main(String args[]) {
		
		if(args.length == 0) {
			System.out.print("Enter arguments nincompoop");
			System.exit(0);
		}
		
		int input = Integer.parseInt(args[0]);
		
		if(input == 0 || input == 1)
			System.out.print("Nor Composite or Prime");
		
		else {
			if(isPrime(input))
				System.out.print("No. is Prime");
			else System.out.print("No. is not Prime");
		}
	}

	static boolean isPrime(int num) {
		boolean flag = true;
		for(int i = 2; i <= Math.sqrt(num);i++)
			if(num % i == 0)
				flag =false;
		return flag;
				
	}

}
