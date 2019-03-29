package flowcontrol;

public class Primer {
	
	static boolean isPrime(int n) {
		
		if(n <= 1)
			return false;	
		for(int i = 3;i < n;i++)
			if(n % i == 0)
				return false;
		return true;		
	}
	
	static void printPrime(int n) {
		
		for(int i = 2;i < n;i++)
			if(i == 2)
				System.out.print(2);
			else if(isPrime(i)) {
				System.out.print(", " + i);
			}
	}
	
	static public void main(String args[]) {
		
		int n = 50;
		printPrime(n);
	}
	
}

