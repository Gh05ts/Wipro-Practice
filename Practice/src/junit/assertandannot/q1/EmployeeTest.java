package junit.assertandannot.q1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	Employee e = new Employee();
	ArrayList<String> list = new ArrayList<>();
	{
		list.add("Drake");
		list.add("Dock");
		list.add("Aaron");
	}

	@Test
	void test() {
		System.out.println(list);
		assertEquals("FOUND", e.findName(list, "Drake"));
//		System.out.println("test");
	}

}
