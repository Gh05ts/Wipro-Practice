package flowcontrol;

public class PosiNegiZero {
	
	public static void main(String[] args) {
		 int a = (int)(Math.random()*10)-(int)(Math.random()*10);
		 if(a<0)
			 System.out.print("No. is Negative");
		 if(a>0)
			 System.out.print("No. is Positive");
		 if(a==0)
			 System.out.print("No. is Zero");
	
	}
}
