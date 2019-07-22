package wrapper;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no. btw 1 and 255: "); 
		int input = sc.nextInt();
		
		String output = String.format("%8s", Integer.toBinaryString(input)).replace(' ', '0');
		System.out.println(output);
		
		
		sc.close();
	}

}
