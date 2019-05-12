package oops.classesandobjects;

class Patient {
	
	 String name; 
	 double height;
	 double weight;
	
	public Patient(String name, double height, double weight) {
		
		this.name = name;
		this.height = height;
		this.weight = weight;	
	}
	
	public double computeBMI() {
		return (weight * 10000) / (height * height);
	}
	
}


public class q3 {

	public static void main(String[] args) {
		Patient obj = new Patient("Luv", 170, 64);
		System.out.println("Name: " + obj.name + " Height: " + obj.height + " Weight: " + obj.weight);
		System.out.print("BMI is: " + obj.computeBMI());
	}

}
