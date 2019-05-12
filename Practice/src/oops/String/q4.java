package oops.String;

public class q4 {

	public static void main(String[] args) {

		String str = "CatDogs";
		
//		String output;
		
		if (str.length() % 2 == 0) {
			str = str.substring(0, str.length() / 2);
		} else {
			str = null;
		}
		
		System.out.println(str);
	}

}
