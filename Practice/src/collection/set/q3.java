package collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class q3 {
	
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("Anthony");
		ts.add("Ass");
		ts.add("John");
		
		TreeSet<String> ts1 = (TreeSet<String>) ts.descendingSet();
		
		System.out.println(ts);
		System.out.println(ts1);
		
		Iterator<String> it = ts.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		String a = "Josh";
		boolean result = false;
				
				while(it.hasNext()) {
					
					if(it.next() == a) {
						result = true;
						break;
					}
				}
		if(result)System.out.println(a + " exists.");
		else System.out.println(a + " doesn't exist.");
				
	}

}
