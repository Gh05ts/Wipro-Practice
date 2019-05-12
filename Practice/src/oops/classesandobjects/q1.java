package oops.classesandobjects;

class Box {
	
	private double width;
	private double height;
	private double depth;
	
	public Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public double getVolume() {
		return width * height * depth;
	}
}

public class q1 {
	
	public static void main(String[] args) {
		Box box = new Box(16, 9, 4);
		System.out.println(box.getVolume());
	}

}
