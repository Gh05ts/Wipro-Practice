package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class q3 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("i1");
		al.add("i2");
		al.add("i3");
		
		print(al);
		
	}
	
	public static void print(ArrayList<String> a) {
		Iterator<String> it = a.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
