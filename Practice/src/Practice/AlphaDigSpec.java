package Practice;

public class AlphaDigSpec {

	static void charCheck(char input_char) {
		if (input_char >= 65 && input_char <=90 || input_char >=97 && input_char <=122)
			System.out.print("Char is alphabet");
		else if (input_char >= 48 && input_char <= 57)
			System.out.print("Char is digit");
		else
			System.out.print("Char is Special Char");
					
		}
	//Driver Code
		public static void main(String[] args) {
			char input_char = 'A';
			charCheck(input_char);
				
			}
		
}


