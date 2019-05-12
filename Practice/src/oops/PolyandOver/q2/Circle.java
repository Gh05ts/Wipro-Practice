package oops.PolyandOver.q2;

public class Circle extends Shape{
	
	@Override
	public void Draw(){
		System.out.println("Drawing Circle");
	}
	@Override
	public void Erase() {
		System.out.println("Erasing Circle");
	}

}
