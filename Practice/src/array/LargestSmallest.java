package array;

import java.util.Arrays;

public class LargestSmallest {
	public static void main(String[] args) {
		int[] Array = {2, 44, 3232, 5, 33, 23, 43};
		Arrays.sort(Array);
		System.out.println(Array[0]);
		System.out.println(Array[1]);
		System.out.println(Array[Array.length-2]);
		System.out.print(Array[Array.length-1]);
		
	}

}
