package collection.set;

import java.util.Iterator;
import java.util.TreeSet;

class Country1 {
	
	TreeSet<String> H1 = new TreeSet<String>();
	
	public TreeSet<String> saveCountryNames (String CountryName){
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


public class q4 {

	public static void main(String[] args) {

		Country1 c = new Country1();
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
