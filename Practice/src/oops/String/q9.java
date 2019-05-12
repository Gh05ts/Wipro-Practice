package oops.String;

public class q9 {

	public static void main(String[] args) {
		
		String a = "Wipro";
		String b = "Something";
		
		String big = a.length() > b.length() ? a : b;
		String small = a.length() < b.length() ? a : b;
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < small.length(); i++) {
			sb.append(a.charAt(i)).append(b.charAt(i));
		}
		
		sb.append(big.substring(small.length(), big.length()));
		System.out.print(sb);

	}

}
