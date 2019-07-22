package abstractExcetion.packages.com.wipro;

import abstractExcetion.packages.automobiles.Ford;
import abstractExcetion.packages.automobiles.Logan;

public class q4 {
	
	public static void main(String[] args) {
		
		Logan logan = new Logan("Wolverine", "PB10F2334", "Coolverine", 210, 1);
		System.out.println(logan.getModelName());
		System.out.println(logan.getOwnerName());
		System.out.println(logan.getRegistrationNumber());
		System.out.println("Speed is: " + logan.speed());
		System.out.println("Has GPS? " + logan.gps());
		
		System.out.println();
		
		Ford ford = new Ford("Ford GT", "PB10F6669", "Elyse", 330, 1);
		System.out.println(ford.getModelName());
		System.out.println(ford.getOwnerName());
		System.out.println(ford.getRegistrationNumber());
		System.out.println("Speed is: " + ford.speed());
		System.out.println("Has AC? " + ford.tempControl());

	}
	
}