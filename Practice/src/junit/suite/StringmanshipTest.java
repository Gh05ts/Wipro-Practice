package junit.suite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringmanshipTest {

	@Test
	void test() {
		Stringmanship s = new Stringmanship("Car");
		assertEquals("CAR", s.toUppercase());
	}

}
