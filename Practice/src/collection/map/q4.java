package collection.map;

import java.util.ArrayList;
import java.util.HashMap;

class ContactList{
	
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	
	public void addContact(String name, Integer no) {
		hm.put(name, no);
	}
	
	public void removeContact(String name) {
		hm.remove(name);
	}
	
	public boolean contactCheck(String s) {
		boolean flag = false;
		if(hm.containsKey(s)) flag = true;
		return flag;		
	}
	
	public boolean numberCheck(Integer s) {
		boolean flag = false;
		if(hm.containsValue(s)) flag = true;
		return flag;		
	}
	
	public ArrayList<String> listContacts() {
		ArrayList<String> listOfKeys = new ArrayList<String>(hm.keySet());
		return listOfKeys;
	}
	
}


public class q4 {

	public static void main(String[] args) {

		ContactList contactsList = new ContactList();
		
		contactsList.addContact("John", 993435353);
		contactsList.addContact("Ambulance", 101);
		contactsList.addContact("Squirrel", 54326234);
				
		System.out.println("John: " + contactsList.contactCheck("John"));
		System.out.println("98765432: " + contactsList.numberCheck(98765432));
		
		System.out.println(contactsList.listContacts());

	}

}
