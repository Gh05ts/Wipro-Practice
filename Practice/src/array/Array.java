package array;

public class Array {

	public static void main(String[] args) {
		
		int[] numbers = {0, 4, 3, 21, 34, 845, 84};
		int sum = 0; int avg = 0;
		for(int i: numbers) {
			sum += i;
		}
		System.out.println("Sum is: " + sum);
		avg = sum/(numbers.length);
		System.out.print("Avg is: " + avg);
	}

}
