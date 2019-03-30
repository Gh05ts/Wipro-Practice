package flowcontrol;

public class ReverseNum {
	public static void main(String args[]) {
		int input = 1234;
		System.out.println("Input is: " + input);
		int reverse = 0;
		
		while(input!=0) {
			reverse = reverse * 10 + input % 10;
			input /= 10;
		}
		
		System.out.print("Output is: " + reverse);
	}
}
