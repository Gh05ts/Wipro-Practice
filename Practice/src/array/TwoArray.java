package array;

public class TwoArray {
	
	public static void PrintArray(int[][ ] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args) {
		if(args.length != 4) {
			System.out.print("Enter 4 numbers");
			System.exit(0);
	}
		
		int x = 0;
		int[][] mularray = new int[2][2];
		int[][] revarray = new int[2][2];
		
		for (int i = 0; i < mularray.length; i++) {
			for (int j = 0; j < mularray[0].length; j++) {
				mularray[i][j] = Integer.parseInt(args[x++]);
			}
		}
		
		for (int i = 0; i < mularray.length; i++) {
			for (int j = 0; j < mularray[0].length; j++) {
				revarray[mularray.length-1-i][mularray.length-1-j] = mularray[i][j];
			}
		}
		
		System.out.println("Given array is: ");
		PrintArray(mularray);
		System.out.println("Reversed array is: ");
		PrintArray(revarray);
	}
	
}
	
