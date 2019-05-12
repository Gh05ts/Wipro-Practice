package oops.String;

public class q8 {

	public static void main(String[] args) {
	    { 
	        String str = "ab*cd"; 
	        String[] arrOfStr = str.split(".[\\*]+."); 
	  
	        for (String a : arrOfStr) 
	            System.out.print(a); 
	    } 

	}

}
