package collection.map;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;

public class q3 {

	public static void main(String[] args) {

		Properties properties = new Properties();
		
		properties.setProperty("Odissa", "Bhubhaneswar");
		properties.setProperty("Punjab", "Chandigarh");
		properties.setProperty("Maharastra", "Mumbai");

		Iterator<Entry<Object, Object>> it = properties.entrySet().iterator();
		
		while (it.hasNext()) {
			Entry<Object, Object> me = it.next();
			System.out.println(me);
		}
	}

}
