package junit.assertandannot.q2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo2Test {
	
	Demo2 demo = new Demo2();

	@Test
	public void testPalindromeCheck() {
		
		assertTrue(demo.palindromeCheck("Mam"));
		assertTrue(demo.palindromeCheck("101"));
		assertTrue(demo.palindromeCheck("dad"));
		assertFalse(demo.palindromeCheck("Delhi"));
		assertFalse(demo.palindromeCheck("Congo"));
	}

}

