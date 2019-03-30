package flowcontrol;

public class BetweenPrime {
	
	static boolean isPrime(int no) {
		boolean flag = true;
		
		for(int i = 2;i <= Math.sqrt(no); i++) {
			if(no % i == 0) {
				flag = false;
				break;
			}	
			if(no == 0|| no == 1) {
				flag = false;
				}
		}		
		return flag;
	}
	
	static public void main(String args[]) {
		
		int low = 3;
		int high = 90;
		
		for(int i = low; i < high; i++) {

			if(i == low) {
				if(isPrime(i)) {
					System.out.print(i);
				}
			}
			
			else if(isPrime(i)) {
					System.out.print(", "+i);
			}
		}
	}	
	
}
