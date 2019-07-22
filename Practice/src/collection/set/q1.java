package collection.set;

import java.util.HashSet;
import java.util.Iterator;

class Country {
	
	HashSet<String> H1 = new HashSet<String>();
	
	public HashSet<String> saveCountryNames (String CountryName){
		H1.add(CountryName);
		return H1;
	}
	
	public String getCountryNames(String CountryName) {
		Iterator<String> it = H1.iterator();
		
		while(it.hasNext()) {
			if(it.next().equals(CountryName)) {
				return CountryName;
			}
		}
		
		return null;
	}
}

public class q1 {

	public static void main(String[] args) {
		Country c = new Country();
		c.saveCountryNames("India");
		c.saveCountryNames("USA");
		c.saveCountryNames("Pakistan");
		c.saveCountryNames("Bangladesh");
		c.saveCountryNames("China");
		
//		System.out.println(c.H1);
		System.out.println("China: " + c.getCountryNames("China"));
		System.out.println("Japan: " + c.getCountryNames("Japan"));	
	}

}
