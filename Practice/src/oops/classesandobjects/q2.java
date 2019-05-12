package oops.classesandobjects;

public class q2 {
	
	public static void main(String[] args) {
		System.out.println(Calculator.PowerInt(3, 4));
		System.out.print(Calculator.PowerDouble(3, 3));
	}
}

class Calculator {
		
	public static int PowerInt(int num1, int num2){
		return (int) Math.pow(num1, num2);
	}
	
	public static double PowerDouble(double num1, double num2) {
		return Math.pow(num1, num2);
	}
}
