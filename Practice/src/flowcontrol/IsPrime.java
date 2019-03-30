package flowcontrol;

public class IsPrime {
	
	public static void main(String args[]) {
		
		int n = 9;
		boolean flag = true;
		for(int i=2; i <= Math.sqrt(n);i++)
			if(n%i==0) {
				flag = false;
				break;
				}

		if(flag)
			System.out.print("Prime");
		else
			System.out.print("No Bueno");
	}

}
