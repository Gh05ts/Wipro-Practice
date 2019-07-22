package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class c1{
	
	HashMap<String, String> hm = new HashMap<>();
	
	public HashMap<String, String> SaveCountryNames(String Country, String Capital){
		hm.put(Country, Capital);
		return hm;
	}
	
	public String GetCapital(String Country) {
		return hm.get(Country);
		
	}
	
	public <K, V> K getCountry(Map<K, V> map, V value) {
		for (Map.Entry<K, V> entry : map.entrySet()) {
			if (value.equals(entry.getValue())) {
				return entry.getKey();
			}
		}
		return null;
	}

	public <K, V> HashMap<V, K> swapKeyValue(Map<K, V> map) {
		HashMap<V, K> rev = new HashMap<V, K>();
				for (Map.Entry<K, V> entry : map.entrySet()) {
					rev.put(entry.getValue(), entry.getKey());
				}
		return rev;
	}
	
	public <K, V> ArrayList<K> toArrayList(Map<K, V> map){
		ArrayList<K> listOfKeys = new ArrayList<K>(map.keySet());
		return listOfKeys;
	}
}


public class q1 {
	
		public static void main(String[] args) {
		c1 countryMap = new c1();

		countryMap.SaveCountryNames("India", "Delhi");
		countryMap.SaveCountryNames("Japan", "Tokyo");
		countryMap.SaveCountryNames("USA", "Washington, D.C.");
		
		System.out.println(countryMap.GetCapital("India"));
		System.out.println(countryMap.getCountry(countryMap.hm, "Tokyo"));
		System.out.println(countryMap.hm);
		System.out.println(countryMap.swapKeyValue(countryMap.hm));
		System.out.println(countryMap.toArrayList(countryMap.hm));

	}
}
