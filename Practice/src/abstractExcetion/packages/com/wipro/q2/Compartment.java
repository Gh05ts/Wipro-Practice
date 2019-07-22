package abstractExcetion.packages.com.wipro.q2;

public class Compartment {
	
	private double height;
	private double width;
	private double breadth;
	
	public Compartment(double height, double width, double breadth) {
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	
	@Override
	public String toString() {
//		System.out.print("Height = " + height + ", Width = " + width + ", Breadth = " + breadth);
		return "Height = " + height + ", Width = " + width + ", Breadth = " + breadth;
	}
	
}
