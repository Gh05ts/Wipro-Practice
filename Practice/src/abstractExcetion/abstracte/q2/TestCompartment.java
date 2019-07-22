package abstractExcetion.abstracte.q2;

import java.util.Random;

public class TestCompartment {
	
	public static void main(String[] args) {
		
		Compartment[] compartments = new Compartment[10];

		Random rand = new Random();
		
		for (int i = 0; i < 10; i++) {
			int Randnum = rand.nextInt(4 - 1 + 1) + 1;
			
	    	if (Randnum == 1)
	    		compartments[i] = new FirstClass();
	    	else if (Randnum == 2)
	    		compartments[i] = new Ladies();
	    	else if (Randnum == 3)
	    		compartments[i] = new General();
	    	else if (Randnum == 4)
	    		compartments[i] = new Luggage();
	    	
	    	System.out.println(compartments[i].notice());
			
		}
		
	}

}
