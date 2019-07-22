package collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class q5 {

	public static void main(String[] args) {

		LinkedList<String> Months = new LinkedList<String>();
		
		Months.add("January");
		Months.add("February");
		Months.add("March");
		Months.add("April");
		Months.add("May");
		Months.add("June");
		Months.add("July");
		Months.add("August");
		Months.add("September");
		Months.add("October");
		Months.add("November");
		Months.add("December");
		
		print(Months);
		
	}
	
	public static void print(LinkedList<String> e) {
		Iterator<String> it = e.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
