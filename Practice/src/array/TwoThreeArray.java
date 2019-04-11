package array;

public class TwoThreeArray {
	public static void main(String[] args) {
		if(args.length != 9) {
			System.out.print("Enter 9 numbers");
			System.exit(0);
		}
		
		int x = 0;
		int[][] mularray = new int[3][3];
		
		for (int i = 0; i < mularray.length; i++) {
			for (int j = 0; j < mularray[0].length; j++) {
				mularray[i][j] = Integer.parseInt(args[x++]);
			}
		}
		
		System.out.println("Given Array is: ");
		TwoArray.PrintArray(mularray);
		
		int sum = 0;
		for (int i = 0; i < mularray.length; i++) {
			for (int j = 0; j < mularray[0].length; j++) {
				sum += mularray[i][j];
			}
		}
		System.out.print("Sum is: " + sum);
	}

}
