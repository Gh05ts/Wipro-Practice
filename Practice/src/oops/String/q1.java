package oops.String;

public class q1 {
	
	public static boolean isPalindrome (String input) {
		int digitCount = input.length();
		boolean isPalindrome = true;
		
		int range = digitCount / 2;
		if (digitCount % 2 == 0) range--;
		
		for (int i = 0; i <= range; i++) {
			if (input.charAt(i) != input.charAt(digitCount - i - 1)) isPalindrome = false;
		}
		
		return isPalindrome;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("ACCA"));
		System.out.println(isPalindrome("MOM"));
		System.out.println(isPalindrome("ACCADACCA"));
	}
}
