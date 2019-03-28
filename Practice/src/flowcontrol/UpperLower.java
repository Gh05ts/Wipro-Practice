package flowcontrol;

public class UpperLower {
	
	public static void main(String args[]) {
		char word = 'a';
		if(Character.isLowerCase(word))
			System.out.print(Character.toUpperCase(word));
		else
			System.out.print(Character.toLowerCase(word));
					
	}
}
