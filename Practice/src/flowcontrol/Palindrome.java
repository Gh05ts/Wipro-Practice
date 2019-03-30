package flowcontrol;

public class Palindrome {
	public static void main(String args[]) {
		if(args.length == 0)
			System.exit(0);
		int num = Integer.parseInt(args[0]);
		int temp = Integer.parseInt(args[0]);
		int reverse = 0;
		
		while(temp!=0) {
			reverse = reverse + temp%10;
			temp /= 10;
		}
		
		if(num == reverse)
			System.out.print("Palindrome");
		else System.out.print("Not Palindrome");
	}

}
