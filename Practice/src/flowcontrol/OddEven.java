package flowcontrol;

public class OddEven {

	public static void main(String[] args) {
		 int a = (int)(Math.random()*10);
		 if(a!=0 && a%2==0)
			 System.out.print("No. is Even");
		 if(a!=0 && a%2!=0)
			 System.out.print("No. is Odd");
		 if(a==0)
			 System.out.print("No. is Zero");
	
	}
}
