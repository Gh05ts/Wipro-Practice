package junit.juniteclipse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyUnitTest {

	@Test
	void testStringConcat() {
		MyUnit myUnit = new MyUnit();
		assertEquals("HelloWorld", myUnit.stringConcat("Hello", "World"));
	}

}
