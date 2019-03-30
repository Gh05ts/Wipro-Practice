package flowcontrol;

public class FloydPatternAsc {

	public static void main(String args[]) {	
		
		if(args.length == 0) {
			System.out.print("Enter something");
			System.exit(0);
		}
		int num = Integer.parseInt(args[0]);
		
		for(int i = 1;i <= num;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.print("*");
				if(i!=j)
					System.out.print(" ");
			} if(i!=num)
				System.out.println();
		}
	}
	
}
