package flowcontrol;

public class TwoThreeFive {
	public static void main(String args[]) {
		int i = 1;
		int flag = 1;
		int trip = 1;
		while(flag<6) {
			if(i%2 == 0 && i%3 == 0 && i%5 ==0) {
				if(trip == 1) {
					System.out.print(i);
					trip--;
				}
				else System.out.print(", "+i);
				flag++;
			}
			i++;
		}
	}

}
