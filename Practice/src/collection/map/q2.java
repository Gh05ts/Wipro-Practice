package collection.map;

import java.util.HashMap;
import java.util.Map;

public class q2 {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Hey");
		hm.put(2, "You!");
		hm.put(3, "Out there in the");
		hm.put(4, "Corner");
		
		int keycheck = 4;
		String valuecheck = "Wis";
		
		System.out.println("Does it contain " + keycheck + "? " + hm.containsKey(keycheck));
		System.out.println("Does it contain " + valuecheck + "? "  + hm.containsValue(valuecheck));
		
		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			
		}
	}

}
