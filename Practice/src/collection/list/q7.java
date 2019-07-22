package collection.list;

import java.util.Iterator;
import java.util.Vector;

class Employee {
	private int id;
	private String name;
	private String address;
	private double salary;
	
	public Employee(int id, String name, String address, double salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee [id = " + id + ", name = " + name + ", address = " + address + ", salary = " + salary + "]";
	}
}

public class q7 {

	public static void main(String[] args) {

		Vector<Employee> list = new Vector<>();
		
		list.add(new Employee(11, "Bobby", "123 road, India", 70000.0));
		list.add(new Employee(12, "Wolf", "234 tunnel, India", 35000.0));
		list.add(new Employee(13, "Eira", "345 street, India", 55000.0));
		list.add(new Employee(14, "Stuey", "456 locality, India", 45000.0));
		
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());
	}

}
