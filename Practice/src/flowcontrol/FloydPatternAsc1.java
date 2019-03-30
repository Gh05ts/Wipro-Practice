package flowcontrol;

public class FloydPatternAsc1 {

	public static void main(String args[]) {	
			
		if(args.length == 0) {
			System.out.print("Enter something");
			System.exit(0);
		}
		int num = Integer.parseInt(args[0]);
		int i = 1;
		
		while(i <= num) {
			int j =1;
			while(j <= i) {
				System.out.print("*");
				if(i!=j)
					System.out.print(" ");
				j++;
			}
				
			if(i!=num)
				System.out.println();
			i++;
		}
		
	}
}
