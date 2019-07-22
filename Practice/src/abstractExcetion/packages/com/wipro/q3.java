package abstractExcetion.packages.com.wipro;

import abstractExcetion.packages.automobiles.Honda;
import abstractExcetion.packages.automobiles.twowheeler.Hero;

public class q3 {
	
	public static void main(String[] args) {
		Hero hero = new Hero("Karizma", "PB16H1234", "Aman Sharma", 115);
		System.out.println("Model Name: " + hero.getModelName());
		System.out.println("Owner Number: " + hero.getOwnerName());
		System.out.println("Registration Number: " + hero.getRegistrationNumber());
		System.out.println("Speed is: " + hero.getSpeed());
		hero.radio();
		
		System.out.println();
		
		Honda honda = new Honda("Honda Civic", "PB18G6969", "Singh Saab", 210);
		System.out.println("Model Name: " + honda.getModelName());
		System.out.println("Owner Number: " + honda.getOwnerName());
		System.out.println("Registration Number: " + honda.getRegistrationNumber());
		System.out.println("Speed is: " + honda.getSpeed());
		honda.cdplayer();

	}

}
