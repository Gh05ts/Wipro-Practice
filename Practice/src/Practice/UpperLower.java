package Practice;

public class UpperLower {
	
	public static void main(String args[]) {
		char word = 'A';
		if(Character.isLowerCase(word))
			System.out.print(Character.toUpperCase(word));
		else
			System.out.print(Character.toLowerCase(word));
					
	}
}
