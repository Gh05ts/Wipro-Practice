package oops.String;

public class q3 {

	public static void main(String[] args) {

		String str = "Wipro";
		int len = str.length();
		
		String repeater = "";
		
		if (len < 2) repeater = str;
		else repeater = str.substring(0, 2);
		
		String output = "";
		
		for (int i = 0; i < len; i++) {
			output += repeater;
		}
		
		System.out.println(output);

	}

}
