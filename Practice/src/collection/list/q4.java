package collection.list;

import java.util.ArrayList;

class MyArrayList<E> extends ArrayList<E> {
	@Override
	public boolean add(E e) {
		
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
			return true;
		}
		else {
			throw new ClassCastException("Only Integer, Float and Double bruh.");
		}
		
	}
}

public class q4 {


	public static void main(String[] args) {

		ArrayList<Object> MixedList = new MyArrayList<>();
		
		try {
			MixedList.add(14);
			MixedList.add(1.2F);
			MixedList.add(3.23423D);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(MixedList);
	}

}
