package array;

public class MaxMin {
	
	public static void main(String[] args) {
		int[] numbers = {0, 387, 39, 23, 39};
		int max = numbers[0];
		int min = numbers[0];
		for (int i: numbers) {
			if(i > max)
				max = i;
			if(i < min)
				min = i;
		}
		System.out.println("Max is: "+max);
		System.out.print("Min is: "+min);
	}

}
