package junit.suite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void test() {
		Calc c = new Calc();
		assertEquals(5, c.add(2, 3));
		assertEquals(3, c.sub(6, 3));
		
	}

}
