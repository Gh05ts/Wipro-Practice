package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class q2 {

	public static void main(String[] args) {

		HashSet<String> hs =  new HashSet<String>();
		hs.add("Alex");
		hs.add("Jay");
		hs.add("Clark");
		
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
